package com.samedify.kodlamaIO.main;

public class User {

	private String name;
	private String surname;
	private String idNumber;

	public User() {

	}

	public User(String name, String surname, String idNumber) {
		super();
		this.name = name;
		this.surname = surname;
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

}
