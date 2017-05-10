
<html>
<%@page import="javax.servlet.http.*" %>
<%@page import="javax.servlet.*" %>

<head>
<script type="text/javascript" src="js/jquery-3.1.1/jquery-3.1.1.min.js"></script>
	<script>
		$(document).ready(function(){
			$("p").click(function(){
				$(this).hide();
			});
		});
	</script>
</head>
<body>
<p>如果您点击我，我会消失。</p>
<p>点击我，我会消失。</p>
<p>也要点击我哦。</p>
	<h1>${message}</h1>

<img src ="img/1.jpg">
</body>
</html>