package com.Hospital.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Hospital.dto.Hospital;
import com.Hospital.service.HospitalService;
@WebServlet("/savehospital")
public class saveHospital extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String place=req.getParameter("place");
		String mailid=req.getParameter("mailid");
		String password=req.getParameter("password");
		
		Hospital hospital=new Hospital();
		hospital.setName(req.getParameter("name"));
		hospital.setMailid(mailid);
		hospital.setPlace(place);
		hospital.setPassword(password);
		
		HospitalService hs=new HospitalService();
		Hospital h2=hs.saveHospital(hospital);
		if(h2!=null)
		{
		RequestDispatcher rd=req.getRequestDispatcher("/displayhospital");
		rd.forward(req, resp);
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("createHospital.jsp");
			rd.include(req, resp);
		}
		
		
	}
}
