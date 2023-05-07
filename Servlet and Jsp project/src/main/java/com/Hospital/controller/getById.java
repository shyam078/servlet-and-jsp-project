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

@WebServlet("/getbyid")
public class getById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		HospitalService service=new HospitalService();
		Hospital hospital=service.getById(id);
		if(hospital!=null) 
		{
			req.setAttribute("hospital", hospital);
			RequestDispatcher dispatcher=req.getRequestDispatcher("updatehospital.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("DisplayHospital.jsp");
			dispatcher.include(req, resp);
		}
	}
}
