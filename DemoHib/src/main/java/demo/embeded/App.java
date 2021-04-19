package demo.embeded;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AlienName an=new AlienName();
    	an.setFname("Arjun");
    	an.setMname("Kumar");
    	an.setLname("Khadka");
    	Alien telusko=new Alien();
    	telusko.setAid(108);
    	telusko.setAname(an);
    	telusko.setColor("Cyan");
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class); //It will take configuration from DemoHib/src/main/java/hibernate.cfg.xml
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();

    	//To save data in database
    	session.save(telusko);
    	
    	tx.commit();
    	
    	System.out.println(telusko);
        
    }
}
