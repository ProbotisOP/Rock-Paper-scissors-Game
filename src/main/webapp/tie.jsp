
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<body>
<style>
body{
    background-image: url('https://media.giphy.com/media/3osxYfP8SJVa9XpVyo/giphy.gif');
    background-size: cover;

    
    
    height: 100vh;
    padding:0;
    margin:0;
}


</style>


}


<br><br><br><br>

<div class="text-center">
  <img src="https://media.giphy.com/media/BSBrMst3JbwRTP04Ce/giphy.gif" class="rounded" alt="...">
   <br>
    <br>
      <br>
  <a href="home.html">PLAY AGAIN</a>
  <br>
			<% HttpSession httpSession = request.getSession();
			String cpu = (String) httpSession.getAttribute("cpu");%>
			<h5>CPU CHOOSES: <%= cpu %></h5>
</div>

</body>
</html>





