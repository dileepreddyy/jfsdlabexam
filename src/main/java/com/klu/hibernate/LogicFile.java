package com.klu.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LogicFile {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernatedup.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Customer c= s.get(Customer.class, 1);
		
		
		s.delete(c);

		t.commit();
		

	}

}
