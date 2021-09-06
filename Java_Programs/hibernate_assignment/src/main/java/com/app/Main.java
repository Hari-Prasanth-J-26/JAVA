package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.app.model.HallTicket;
import com.app.model.Students;

public class Main {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Create
		/*
		HallTicket hallTicket1 = new HallTicket(1001, "08th-sem", 3);
		Students student1 = new Students("Hari", "Final year", hallTicket1);
		session.save(hallTicket1);
		session.save(student1);
		HallTicket hallTicket2 = new HallTicket(1002, "06th-sem", 6);
		Students student2 = new Students("Dinesh", "Third year", hallTicket2);
		session.save(hallTicket2);
		session.save(student2);
		HallTicket hallTicket3 = new HallTicket(1003, "04th-sem", 7);
		Students student3 = new Students("Kumaran", "Second year", hallTicket3);
		session.save(hallTicket3);
		session.save(student3);
		HallTicket hallTicket4 = new HallTicket(1004, "02th-sem", 7);
		Students student4 = new Students("Murugesh", "First year", hallTicket4);
		session.save(hallTicket4);
		session.save(student4);
		HallTicket hallTicket5 = new HallTicket(1005, "04th-sem", 6);
		Students student5 = new Students("Aravinth", "Second year", hallTicket5);
		session.save(hallTicket5);
		session.save(student5);
		*/
		
		//Read
		
		for(int i=1;i<=5;i++) {
			Students students = (Students) session.get(Students.class, i);
			System.out.println(students);
		}
		
		
		//Update
		/*
		Students students = (Students) session.get(Students.class, 3);
		students.setName("Sanjay");
		session.update(students);
		*/
		
		//Delete
		/*
		Students students = new Students();
		students.setId(4);
		session.delete(students);
		*/
		
		transaction.commit();
		session.close();

		factory.close();

	}

}
