package rpsgame.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/optionchk")
public class optionCheck extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int user = Integer.parseInt(request.getParameter("user"));
		PrintWriter out = response.getWriter();

		response.setIntHeader("Refresh", 5);
		
		HttpSession httpSession = request.getSession();
		

		Random random = new Random();
		int cpu = random.nextInt(3);
		
		
		
		switch (cpu) {
		case 0:
			System.out.print("CPU CHOOSE ROCK ");
			System.out.println();
			httpSession.setAttribute("cpu", "ROCK");

			break;

		case 1:
			System.out.print("CPU CHOOSE PAPER ");
			System.out.println();
			httpSession.setAttribute("cpu", "PAPER");
			

			break;
		case 2:
			System.out.print("CPU CHOOSE SCISSOR ");
			System.out.println();
			httpSession.setAttribute("cpu", "SCISSOR");

			break;

		default:
			break;
		}

		String msg = "YOU WIN!!!!!";

		if (user == 1 && cpu == 2 || user == 2 && cpu == 0 || user == 3 && cpu == 1) {
			// out.print("<html><h1>"+msg+"</html></h1>");
			// RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			response.sendRedirect(request.getContextPath() + "/win.jsp");
			

		}

		else if (user == 1 && cpu == 1 || user == 2 && cpu == 2 || user == 3 && cpu == 0) {
			msg = "CPU WINS !!!!";
			response.sendRedirect(request.getContextPath() + "/lose.jsp");
			

		} else {

			msg = "MATCH TIE !!!!";
			response.sendRedirect(request.getContextPath() + "/tie.jsp");
			

		}

//		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");

	}

}
