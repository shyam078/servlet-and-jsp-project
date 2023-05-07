package com.Hospital.service;

import java.util.List;

import com.Hospital.dao.HospitalDao;
import com.Hospital.dto.Hospital;

public class HospitalService {
HospitalDao dao=new HospitalDao();

	public Hospital saveHospital(Hospital hospital) 
	{
	return dao.saveHospital(hospital);
	}
	public Hospital UpdateHospital(Hospital hospital)
	{
		return dao.UpdateHospital(hospital);
	}
	public Hospital deleteById(int id)
	{
		return dao.deleteById(id);
	}
	public List<Hospital> displayAll()
	{
		return dao.displayAll();
	}
	public Hospital getById(int id)
	{
		return dao.getById(id);
	}
	public Hospital Login(String email,String password)
	{
		return dao.LogIn(email, password);
	}
}
