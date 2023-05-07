<%@page import="com.Hospital.dto.Hospital"%>
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
	height: 150px;
	background-image: none;
	background-color: buttonface;
}
form {
	border: 2px solid black;
	width: 500px;
	height: 500px;
	background-color: window;
}
input {
	width: 250px;
	height: 40px;
	font-size: 18px;
}
button{
width: 250px;
	height: 40px;
	background-color: fuchsia;
}
button:hover{
width: 250px;
	height: 40px;
	background-color: aqua;
}
</style>
</head>
<body>
<%Hospital hospital=(Hospital) request.getAttribute("hospital"); %>
<center>
<form action="updatehospital">
<a href="HospitalHome.jsp">Home</a><br><br>
<h1>Update Form</h1><br><br>
<input type="number" placeholder="enter id" name="id" value="<%=hospital.getId()%>" readonly="readonly"><br><br>
<input type="text" placeholder="enter name" name="name" value="<%=hospital.getName()%>"><br><br>
<input type="text" placeholder="enter place" name="place" value="<%=hospital.getPlace()%>"><br><br>
<input type="email" placeholder="enter mail_id" name="mailid" value="<%=hospital.getMailid()%>"><br><br>
<input type="password" placeholder="enter password" name="password" value="<%=hospital.getPassword()%>"><br><br>

<button type="submit">Update</button>
</form>
</center>
</body>
</html>