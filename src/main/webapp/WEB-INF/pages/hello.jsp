
<html>
<%@page import="javax.servlet.http.*" %>
<%@page import="javax.servlet.*" %>

<head>
<script type="text/javascript" src="js/jquery-3.1.1/jquery-3.1.1.min.js"></script>
	<script type="text/javascript">
		function fun(){

			$.ajax({
			type: "POST",
			url: "${pageContext.request.contextPath}/travelList",
			dataType: "json",
			success: function(data){
			alert(data.success);
			}
			});

		}
	</script>
</head>
<body onload ="fun()">
	<h1>${message}</h1>

<img src ="img/1.jpg">
</body>
</html>