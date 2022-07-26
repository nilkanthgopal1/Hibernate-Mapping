package manytomany;

import org.hibernate.Session;

public class Test {
	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Student s1=new Student();
		
		s1.setName("ABC");
		
		Course c1=new Course();
		  c1.setCname("Java");
		  Course c2=new Course();
		  c2.setCname("Spring");
		  s1.getScourse().add(c1);
		  s1.getScourse().add(c2);
		  session.save(s1);
		  session.beginTransaction().commit();
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
	}

}
