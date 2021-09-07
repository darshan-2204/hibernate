package com.xworkz.birds.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.birds.entity.MobileEntity;
import com.xworkz.birds.util.SFUtil;

public class MobileImpl implements MobileDAO {
	private SessionFactory factory = SFUtil.getFactory();

	@Override
	public int save(MobileEntity entity) {
		try (Session session = factory.openSession()) {
			Transaction trans = session.beginTransaction();
			int key = (int) session.save(entity);
			trans.commit();
			return key;
		}

	}

	@Override
	public void readAllReacords() {
		System.out.println("Invoked readAllReacords()");
		try (Session session = factory.openSession()) {
			Query query = session.createQuery("from MobileEntity");
			List list = query.list();

			System.out.println(list);
		}

	}

	@Override
	public void updateColorByBrand() {
		System.out.println("Invoked readAllReacords()");

		try (Session session = factory.openSession()) {
			Query query = session.createQuery("update MobileEntity mobile set mobile.color='Grey' where brand='mi'");
			Transaction trans = session.beginTransaction();
			query.executeUpdate();
			session.getTransaction();
			trans.commit();

		}
	}

	@Override
	public double readMaxPrice() {
		System.out.println("Invoked readMaxPrice()");

		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select max(price) from MobileEntity");
			Transaction trans = session.beginTransaction();
			List list = query.getResultList();
			session.getTransaction();
			trans.commit();
			System.out.println(list);
			return 22.0;
		}
	}

	@Override
	public int readMinPrice() {
		System.out.println("Invoked readMaxPrice()");

		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select min(price) from MobileEntity");
			Transaction trans = session.beginTransaction();
			List list = query.getResultList();
			session.getTransaction();
			trans.commit();
			System.out.println(list);
			return 0;
		}
	}

	@Override
	public void readAvgPrice() {
		System.out.println("Invoked readAvgPrice()");

		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select Avg(price) from MobileEntity");
			Transaction trans = session.beginTransaction();
			List list = query.getResultList();
			session.getTransaction();
			trans.commit();
			System.out.println(list);

		}
	}

	@Override
	public void readSumPrice() {
		System.out.println("Invoked readSumPrice()");

		try (Session session = factory.openSession()) {
			Query query = session.createQuery("select sum(price) from MobileEntity");
			Transaction trans = session.beginTransaction();
			List list = query.getResultList();
			session.getTransaction();
			trans.commit();
			System.out.println(list);

		}
	}
}
