package com.xworkz.birds.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.birds.entity.BirdEntity;
import com.xworkz.birds.util.SFUtil;

public class BirdDAOImpl implements BirdDAO {

	@Override
	public int save(BirdEntity entity) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		int pk = (int) session.save(entity);
		trans.commit();
		System.out.println(pk);
		session.close();
		//factory.close();
		return pk;
	}

	@Override
	public BirdEntity readById(BirdEntity entity) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, entity.getId());
		System.out.println(bird);
		trans.commit();
		session.close();
		return bird;

	}

	@Override
	public void update(int id, String name) {
		SessionFactory factory = SFUtil.getFactory();
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		bird.setName(name);
		session.update(bird);
		System.out.println(bird);
		trans.commit();
		session.close();
		//factory.close();
	}

	@Override
	public void delete(int id) {
		SessionFactory fact = SFUtil.getFactory();
		Session session = fact.openSession();
		Transaction trans = session.beginTransaction();
		BirdEntity bird = session.get(BirdEntity.class, id);
		session.delete(bird);
		System.out.println("deleted :" + bird);
		trans.commit();
		session.close();
	}

}
