<%@page import="com.Hospital.dto.Hospital"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	width: 100%;
	height: 100px;
	background-color: activecaption;
	
}
table{
background-color: activeborder;
border: 5px;
width: 650px;
border-color:blue;
border-collapse: collapse;
}
th{
width: 80px;
	height: 20px;
	text-align: center;
	font-size: 20px;
	color: gray;
}
td{
	width: 80px;
	height: 80px;
	font-size: 25px;
	color: white;
	text-align: center;
}
a {
	text-decoration: none;
	color: orange;
}
a:hover{
	text-decoration: none;
	color: yellow;
}
h1{
color: white;
word-spacing: 10px;
letter-spacing: 15px;
}
</style>
</head>
<body>
<% List<Hospital> list=(List<Hospital>) request.getAttribute("addlist");%>
<center>
<h1>Hospital details</h1>
<table border="5px">
<tr>
<th>ID</th>
<th>Name</th>
<th>Place</th>
<th>Email_id</th>
<th>password</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<% for(Hospital hospital : list) {%>
<tr>
<td><%= hospital.getId() %></td>
<td><%= hospital.getName() %></td>
<td><%= hospital.getPlace() %></td>
<td><%= hospital.getMailid() %></td>
<td><%= hospital.getPassword()%></td>
<td><a href="getbyid?id=<%=hospital.getId()%>">edit</a></td>
<td><a href="deletehospital?id=<%=hospital.getId()%>">delete</a></td>
</tr>

<%} %>
</table>

<span><a href="HospitalHome.jsp">Back to Home</a></span>
</center>
</body>
</html>