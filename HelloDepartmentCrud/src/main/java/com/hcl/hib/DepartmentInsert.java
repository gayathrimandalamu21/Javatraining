package com.hcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentInsert {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		Department department=new Department();
		department.setDeptno(34457);
		department.setDname("java");
		department.setLoc("e-city");
		department.setCity("banglore");
		department.setHead("team manager");
		s.save(department);
		t.commit();
		System.out.println("Record Inserted....");
		
	}

}
