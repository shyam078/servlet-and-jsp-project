package com.Hospital.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.Hospital.dto.Hospital;

public class HospitalDao {
	static EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("shyam");
	static EntityManager entityManager=entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Hospital saveHospital(Hospital hospital)
	{
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}
	public Hospital UpdateHospital(Hospital hospital)
	{
		entityTransaction.begin();
		entityManager.merge(hospital);
		entityTransaction.commit();
		return hospital;
	}
	public Hospital deleteById(int id)
	{
		Hospital hospital=entityManager.find(Hospital.class, id);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return hospital;
		}
		return null;
	}
	public List<Hospital> displayAll()
	{
		Query query=entityManager.createQuery("select h from Hospital h");
		return query.getResultList();
	}
	public Hospital getById(int id)
	{
	return	entityManager.find(Hospital.class, id);
	}
	public Hospital LogIn(String email,String password)
	{
		Query query=entityManager.createQuery("select h from Hospital h where h.mailid=?1 and h.password=?2");
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<Hospital> hospital=query.getResultList();
		if(hospital.size()>0)
		{
			return (Hospital) hospital.get(0);
		}
		return null;
	}
}
