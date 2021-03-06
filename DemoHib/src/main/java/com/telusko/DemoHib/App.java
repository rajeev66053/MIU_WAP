package com.telusko.DemoHib;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args )
    {
    	Alien telusko=new Alien();
    	telusko.setAid(107);
    	telusko.setAname("Arjun");
    	telusko.setColor("Blue");
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class); //It will take configuration from DemoHib/src/main/java/hibernate.cfg.xml
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();

    	//To save data in database
    	session.save(telusko);
    	
    	//To fetch data from database
    	telusko=session.get(Alien.class, 106);
    	tx.commit();
    	
    	System.out.println(telusko);
        
    }
}
