package com.njangi.model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String name;
	private double amount;
	private int number_of_people;
	private String type_of_currency;
	private Date meeting_date;
	
	
	public Account() {};
	
	public Account(int id, String name, double amount, int number_of_people, String type_of_currency,
			Date meeting_date) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.number_of_people = number_of_people;
		this.type_of_currency = type_of_currency;
		this.meeting_date = meeting_date;
	}

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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNumber_of_people() {
		return number_of_people;
	}

	public void setNumber_of_people(int number_of_people) {
		this.number_of_people = number_of_people;
	}

	public String getType_of_currency() {
		return type_of_currency;
	}

	public void setType_of_currency(String type_of_currency) {
		this.type_of_currency = type_of_currency;
	}

	public Date getMeeting_date() {
		return meeting_date;
	}

	public void setMeeting_date(Date meeting_date) {
		this.meeting_date = meeting_date;
	}
	
	
	
	

}
