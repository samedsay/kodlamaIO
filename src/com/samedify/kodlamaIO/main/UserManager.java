package com.samedify.kodlamaIO.main;

public class UserManager {

	public void addUser(User user) {
		System.out.println(user.getName() + "_" + user.getSurname() + "_" + user.getIdNumber() + " added in DB!");
	}

	public void addUser(User[] users) {

		for (User user : users) {

			System.out.println(user.getName() + "_" + user.getSurname() + "_" + user.getIdNumber() + " added in DB!");

		}
	}

}
