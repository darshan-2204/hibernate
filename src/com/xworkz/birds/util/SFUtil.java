package com.xworkz.birds.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SFUtil {
	
	private static SessionFactory factory;
	public static SessionFactory getFactory() {
		if(factory !=null && factory.isClosed()) {
			throw new IllegalStateException("some one closed SessionFactory,please correct the code");
		}
		return factory;
	}

	static {
		try {
			System.out.println("SF starts");
			Configuration conf=new Configuration().configure();
			factory=conf.buildSessionFactory();
			System.out.println("Sf blocked");
		}catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
