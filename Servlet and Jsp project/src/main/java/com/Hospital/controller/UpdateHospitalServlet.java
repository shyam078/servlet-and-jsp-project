package com.Hospital.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Hospital.dto.Hospital;
import com.Hospital.service.HospitalService;
@WebServlet("/updatehospital")
public class UpdateHospitalServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	Hospital hospital=new Hospital();
	hospital.setId(Integer.parseInt(req.getParameter("id")));
	hospital.setName(req.getParameter("name"));
	hospital.setPlace(req.getParameter("place"));
	hospital.setMailid(req.getParameter("mailid"));
	hospital.setPassword(req.getParameter("password"));
	
	
	HospitalService hospitalService=new  HospitalService();
	Hospital hospital2=hospitalService.UpdateHospital(hospital);
	if(hospital2!=null)
	{
		//req.setAttribute("addlist", hospital);
		RequestDispatcher dispatcher=req.getRequestDispatcher("/displayhospital");
		dispatcher.forward(req, resp);
		
	}else {
		RequestDispatcher dispatcher=req.getRequestDispatcher("");
		dispatcher.include(req, resp);
	}
	
}
}
