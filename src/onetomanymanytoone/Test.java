package onetomanymanytoone;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e1=new Employee();
		
		e1.setName("xyz");
		e1.setDesignation("Manager");
		Employee e2=new Employee();
		e2.setName("Pqr");
		e2.setDesignation("Manager");
		Department department=new Department();
		department.setDname("IT");
		department.getSemp().add(e1);
		department.getSemp().add(e2);
		
		e1.setDepartment(department);
		e2.setDepartment(department);
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.save(department);
		session.beginTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
