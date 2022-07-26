import org.hibernate.Session;


public class Test {
	
	public static void main(String[] args) {
		
		
		
		
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		Account ac=new Account();
		ac.setName("xyz");
		ac.setType("saving");
		Accountplus acp=new Accountplus();
		acp.setAmount(50000);
		ac.setAccountplus(acp);
		acp.setAccount(ac);
		session.save(ac);
		session.beginTransaction().commit();
		
		
		
		
		
		
		
	}

}
