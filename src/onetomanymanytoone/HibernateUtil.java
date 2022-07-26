package onetomanymanytoone;


import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.dialect.MySQLDialect;

public class HibernateUtil {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory()
	{
		Map<String,Object> setting=new HashMap<>();
		
		setting.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
		setting.put(Environment.URL,"jdbc:mysql://localhost:3306/hibernate");
		setting.put(Environment.USER,"root");
		setting.put(Environment.PASS,"root");
		setting.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		setting.put(Environment.HBM2DDL_AUTO,"create");
		setting.put(Environment.SHOW_SQL,"true");
		
		if(sessionFactory==null)
		{
			registry=new StandardServiceRegistryBuilder().applySettings(setting).build();
			
			MetadataSources mds=new MetadataSources(registry);
			mds.addAnnotatedClass(Employee.class);
			mds.addAnnotatedClass(Department.class);
			
			Metadata md=mds.getMetadataBuilder().build();
			
			sessionFactory=md.getSessionFactoryBuilder().build();
		}
		
		return sessionFactory;
	}
	

}
