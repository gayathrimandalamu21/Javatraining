package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentShow {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Department");
		List<Department> departmentlist=q.list();
		for (Department department : departmentlist) {
			System.out.println("Department no "+department.getDeptno());
			System.out.println("Dname "+department.getDname());
			System.out.println("Location "+department.getLoc());
			System.out.println("Head "+department.getHead());
			System.out.println("City "+department.getCity());
			System.out.println("----------");
			
		}
	}

}
