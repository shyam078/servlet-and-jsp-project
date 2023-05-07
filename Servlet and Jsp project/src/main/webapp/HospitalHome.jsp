<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HOOME PAGE</title>
<style type="text/css">
ul{
list-style-type: none;
margin: 0;
padding: 0;
background-color: #f1f1f1;
overflow: hidden;
}
li{
float:left;
border-right: 1px solid #bbb;
}
li a{
display: block;
color:black;
text-align:center;
padding: 24px 66px;
text-decoration: none;
}
li a:hover {
	background-color: #555;
	color:white;
}
</style>
</head>
<body>
<a class="b" href="index.jsp">back</a><br><br>
<ul>
<li><a href="createHospital.jsp">CREATE HOSPITAL</a></li>
<li><a href="displayhospital">DISPLAY HOSPITAL</a></li>
<!--<li><a href="DisplayBranch.jsp">DISPLAY BRANCH</a></li>  -->
</ul>
<a href="index.jsp">Logout</a>
</body>
</html>