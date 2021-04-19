package firstLevelCacheDemo;


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
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();

    	a=session.get(Alien.class, 101); // This is the first time to fetch data so it will fetch from database. So it will execute query
    	System.out.println(a);
    	
    	a=session.get(Alien.class, 101);// If we use this code for same id it will fetch data from first level caching.It will fetch from caching so no query execute tthis time.
    	System.out.println(a);
    	
    	   	
    	tx.commit();
    	
        
    }
}
