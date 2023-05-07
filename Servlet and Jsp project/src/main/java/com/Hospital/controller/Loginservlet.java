package com.Hospital.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Hospital.dto.Hospital;
import com.Hospital.service.HospitalService;
@WebServlet("/hospitalLogin")
public class Loginservlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");
	String password=req.getParameter("password");
	
	HospitalService service=new HospitalService();
	Hospital hospital=service.Login(email, password);
	if(hospital!=null)
	{
	RequestDispatcher rd=req.getRequestDispatcher("HospitalHome.jsp");
	rd.forward(req, resp);
	}
	else
	{
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
		rd.include(req, resp);
	}
}
}
