package com.app;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.app.model.Employee;

public class Main {

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//CRUD operations using primary key only
		//create
//		Employee emp1 = new Employee("Hari", 22, "Male", "hari123@gmail.com", "Bangalore", 80000.00, 8675539777L);
//		session.save(emp1);
//		Employee emp2 = new Employee("Dinesh", 23, "Male", "deinesh123@gmail.com", "Chennai", 60000.00, 7894561239L);
//		session.save(emp2);
//		Employee emp3 = new Employee("Kumaran", 24, "Male", "kumaran123@gmail.com", "Coimbatore", 50000.00, 9587456112L);
//		session.save(emp3);
//		Employee emp4 = new Employee("Abi", 22, "Female", "abi123@gmail.com", "Pune", 40000.00, 6587945123L);
//		session.save(emp4);
		//read
//		Employee emp = (Employee)session.get(Employee.class, 2);
//		System.out.println(emp);
		//update
//		Employee emp = (Employee)session.get(Employee.class, 2);
//		emp.setName("Murugesh");
//		session.update(emp);
		//delete
//		Employee emp = new Employee();
//		emp.setId(2);
//		session.delete(emp);
		
//		Query query = session.createQuery("from com.app.model.Employee order by salary asc");
//		List<Employee> employeeList = query.list();
//		for(Employee list : employeeList) {
//			System.out.println(list);
//		}
		
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.between("age", 22, 23));
		List<Employee> employeeList = criteria.list();
		for(Employee list : employeeList) {
			System.out.println(list);
		}
		transaction.commit();
		session.close();
		factory.close();
	}

}
