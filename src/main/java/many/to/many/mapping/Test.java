package many.to.many.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = config.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Developers dev1 = new Developers();
		dev1.setName("Akhilesh");
		dev1.setDesignation("Sr. Dev");
		
		Developers dev2 = new Developers();
		dev2.setName("Akanksha");
		dev2.setDesignation("Team Lead");
		
		Projects pro1 = new Projects();
		pro1.setModule("Banking");
		pro1.setName("HDFC mobile app");
		
		Projects pro2 = new Projects();
		pro2.setModule("Insurance");
		pro2.setName("Insurance amount calculator");
		
		dev1.getPro().add(pro1);
		dev1.getPro().add(pro2);
		
		pro2.getDev().add(dev1);
		pro2.getDev().add(dev2);
		
		session.save(pro1);
		session.save(pro2);
		session.save(dev1);
		session.save(dev2);
		
		transaction.commit();
		session.close();
	}

}
