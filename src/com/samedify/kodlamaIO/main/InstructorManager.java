package com.samedify.kodlamaIO.main;

public class InstructorManager extends UserManager {

	public void addNewCourseToTheSchedule(Instructor instructor) {
		System.out.println(instructor.getName() + " added " + instructor.getUsedLanguage() + " to the schedule!");
	}

}
