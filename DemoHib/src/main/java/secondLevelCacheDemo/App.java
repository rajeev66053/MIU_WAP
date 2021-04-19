package secondLevelCacheDemo;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien a=null;
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class); //It will take configuration from DemoHib/src/main/java/hibernate.cfg.xml
    	
    	SessionFactory sf=con.buildSessionFactory();
    	/* One way of doing using hibernate method*/
		/*
		 * Session session1=sf.openSession();
		 * 
		 * Transaction tx1=session1.beginTransaction();
		 * 
		 * a=session1.get(Alien.class, 101); // This is the first time to fetch data so
		 * it will fetch from database. So it will execute query System.out.println(a);
		 * 
		 * tx1.commit(); session1.close();
		 * 
		 * Session session2=sf.openSession();
		 * 
		 * Transaction tx2=session2.beginTransaction();
		 * 
		 * a=session2.get(Alien.class, 101);// If we use this code for same id it will
		 * fetch data from database too because in this case session is different.To
		 * fetch data from chache we need to use second level cache.
		 * System.out.println(a);
		 * 
		 * tx2.commit(); session2.close();
		 */
    	
    	
    	/* Another way of doing using query without using hibernate method.*/
    	Session session3=sf.openSession();
    	
    	Transaction tx3=session3.beginTransaction();
    	Query q1=session3.createQuery("from Alien where aid=101");
    	q1.setCacheable(true); //set true to enable second level caching for query
    	a=(Alien) q1.uniqueResult();
    	System.out.println(a);

    	tx3.commit();
    	session3.close();
    	
    	Session session4=sf.openSession();
    	
    	Transaction tx4=session4.beginTransaction();
    	Query q2=session4.createQuery("from Alien where aid=101");
    	q2.setCacheable(true); //set true to enable second level caching for query
    	
    	a=(Alien) q2.uniqueResult();// If we use this code for same id it will fetch data from database too because in this case session is different.To fetch data from chache we need to use second level cache.

    	System.out.println(a);
    	
    	tx4.commit();
    	session4.close();
    	
        
    }
}
