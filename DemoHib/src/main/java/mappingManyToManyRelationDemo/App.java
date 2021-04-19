package mappingManyToManyRelationDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import demo.embeded.Alien;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop laptop=new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
		
		Student student=new Student();
		student.setRollno(1);
		student.setName("Kledji");
		student.setMarks(66);
		
		List<Laptop> laptops=student.getLaptop();
		laptops.add(laptop);
		
		List<Student> students=laptop.getStudent();
		students.add(student);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class); //It will take configuration from DemoHib/src/main/java/hibernate.cfg.xml
    	
    	SessionFactory sf=con.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	
    	Transaction tx=session.beginTransaction();
    	
    	//To save data in database
    	session.save(laptop);
    	session.save(student);
    	
    	tx.commit();

	}

}
