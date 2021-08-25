package com.xwork.soap.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xwork.soap.dto.SoapDTO;

public class SoapDAOImpl implements SoapDAO {
	
	SoapDTO soap = null;

	@Override
	public int save(SoapDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(SoapDTO.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(dto);
		trans.commit();
		System.out.println(pk);
		session.close();
		factory.close();
		return pk;
	}

	@Override
	public int saveAndUpdate(SoapDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(SoapDTO.class);
		SessionFactory sessionfact = configure.buildSessionFactory();
		Session session = sessionfact.openSession();
		Transaction trans = session.beginTransaction();
		soap = (SoapDTO) session.get(SoapDTO.class,3 );
		soap.setName("Dove");
		session.update(soap);
		session.getTransaction().commit();
		System.out.println("updated name : " + soap);
		session.close();
		return 2;
	}
	

	@Override
	public int delete(SoapDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(SoapDTO.class);
		SessionFactory sessionfact = configure.buildSessionFactory();
		Session session = sessionfact.openSession();
		Object obj = session.get(SoapDTO.class, new Integer(2));
		SoapDTO soap = (SoapDTO) obj;
		Transaction trans = session.beginTransaction();
		session.delete(soap);
		System.out.println("data as been deleted");
		trans.commit();
		session.close();
		sessionfact.close();
		return 0;
	}


	@Override
	public int read(SoapDTO dto) {
		Configuration configure = new Configuration();
		configure.configure();
		configure.addAnnotatedClass(SoapDTO.class);
		SessionFactory sessionfact =configure.buildSessionFactory();
		Session session = sessionfact.openSession();
		Transaction trans = session.beginTransaction();
		SoapDTO soap = (SoapDTO) session.get(SoapDTO.class, 2);
		System.out.println(soap);
		trans.commit();
		session.close();
		sessionfact.close();

		return 2;
	}
}
