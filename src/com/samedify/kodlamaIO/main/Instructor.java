package com.samedify.kodlamaIO.main;

public class Instructor extends User {

	private String experiencedYear;
	private String usedLanguage;

	public Instructor() {

	}

	public Instructor(String name, String surname, String idNumber, String experiencedYear, String usedLanguage) {
		super(name, surname, idNumber);
		this.experiencedYear = experiencedYear;
		this.usedLanguage = usedLanguage;
	}

	public String getExperiencedYear() {
		return experiencedYear;
	}

	public void setExperiencedYear(String experiencedYear) {
		this.experiencedYear = experiencedYear;
	}

	public String getUsedLanguage() {
		return usedLanguage;
	}

	public void setUsedLanguage(String usedLanguage) {
		this.usedLanguage = usedLanguage;
	}

}
