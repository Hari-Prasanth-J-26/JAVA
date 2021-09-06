package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class HallTicket {

	@Id
	private int hallTicketNumber;
	private String semester;
	private int totalSubjects;

	public int getHallTicketNumber() {
		return hallTicketNumber;
	}

	public void setHallTicketNumber(int hallTicketNumber) {
		this.hallTicketNumber = hallTicketNumber;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public int getTotalSubjects() {
		return totalSubjects;
	}

	public void setTotalSubjects(int totalSubjects) {
		this.totalSubjects = totalSubjects;
	}

	public HallTicket(int hallTicketNumber, String semester, int totalSubjects) {
		super();
		this.hallTicketNumber = hallTicketNumber;
		this.semester = semester;
		this.totalSubjects = totalSubjects;
	}

	public HallTicket() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "HallTicket [hallTicketNumber=" + hallTicketNumber + ", semester=" + semester + ", totalSubjects="
				+ totalSubjects + "]";
	}

}
