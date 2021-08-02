package com.samedify.kodlamaIO.main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Smd", "Sy", "111111", "Java", 1200);
		Student student2 = new Student("Ahmt", "Ky", "22222", "Swift", 980);

		Instructor instructor = new Instructor("Engn", "Dmrg", "99999", "11", "Java");
		Instructor instructor2 = new Instructor("Slmn", "Khy", "88888", "8", "JavaScript");

		User[] userArray = { student, student2, instructor, instructor2 };

		UserManager userManager = new UserManager();
		userManager.addUser(userArray);

		StudentManager studentManager = new StudentManager();
		studentManager.joinToTheClub(student);
		studentManager.joinToTheClub(student2);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addNewCourseToTheSchedule(instructor);
		instructorManager.addNewCourseToTheSchedule(instructor2);

	}

}
