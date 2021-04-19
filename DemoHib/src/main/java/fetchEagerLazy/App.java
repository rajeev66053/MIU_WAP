package fetchEagerLazy;

import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Alien.class); //It will take configuration from DemoHib/src/main/java/hibernate.cfg.xml
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	Alien a1= session.get(Alien.class, 102);
    	System.out.println(a1.getAname());// To get all the data including laptop collection use eaager loading in Alien class.
    	
    	//this is lazy loading because we need to fetch laptops seperate when needed.
		/*
		 * Collection<Laptop> laptops=a1.getLaptops();
		 * 
		 * for(Laptop l:laptops) { System.out.println(l); }
		 */
    	    	
    	tx.commit();

	}

}
