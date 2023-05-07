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
@WebServlet("/deletehospital")
public class DeleteHospitalservlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	
	Hospital hospital=new Hospital();
	hospital.setId(id);
	
	HospitalService hospitalService=new HospitalService();
	Hospital hospital2=hospitalService.deleteById(id);
	if(hospital2!=null)
	{
		RequestDispatcher dispatcher=req.getRequestDispatcher("/displayhospital");
		dispatcher.forward(req, resp);
	}
	else {
		RequestDispatcher dispatcher=req.getRequestDispatcher("HospitalHome.jsp");
		dispatcher.include(req, resp);
	}
}
}
