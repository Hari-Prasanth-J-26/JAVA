package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Students {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String year;
	@OneToOne
	private HallTicket hallTicket;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public HallTicket getHallTicket() {
		return hallTicket;
	}

	public void setHallTicket(HallTicket hallTicket) {
		this.hallTicket = hallTicket;
	}

	public Students(String name, String year, HallTicket hallTicket) {
		super();
		this.name = name;
		this.year = year;
		this.hallTicket = hallTicket;
	}
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", year=" + year + ", hallTicket=" + hallTicket + "]";
	}

}
