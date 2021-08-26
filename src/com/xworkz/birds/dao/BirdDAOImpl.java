package com.xworkz.birds.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birds.entity.BirdEntity;

public class BirdDAOImpl implements BirdDAO {

	BirdEntity en = null;

	@Override
	public int save(BirdEntity entity) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		factory.close();
		return pk;
	}

	@Override
	public BirdEntity readById(int id) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		en = (BirdEntity) session.get(BirdEntity.class, id);
		session.close();
		factory.close();
		System.out.println("ReadById : " + en);
		return en;
	}

	@Override
	public BirdEntity update(int id) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		en = (BirdEntity) session.get(BirdEntity.class, id);
		en.setColor("BlacK");
		session.update(en);
		trans.commit();
		System.out.println(en);
		session.close();
		factory.close();
		return en;
	}

	@Override
	public BirdEntity delet(int id) {
		Configuration configure = new Configuration().configure().addAnnotatedClass(BirdEntity.class);
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		en = (BirdEntity) session.get(BirdEntity.class, id);
		session.delete(en);
		trans.commit();
		System.out.println(en);
		session.close();
		factory.close();
		return en;
	}

}
