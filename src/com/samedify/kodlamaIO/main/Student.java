package com.samedify.kodlamaIO.main;

public class Student extends User {

	private String followedCourseName;
	private int points;
	private String nickName;

	public Student() {

	}

	public Student(String name, String surname, String idNumber, String followedCourseName, int points) {
		super(name, surname, idNumber);
		this.followedCourseName = followedCourseName;
		this.points = points;
	}

	public String getNickName(Student student) {
		nickName = student.getName().substring(0, 1) + student.getSurname().substring(0, 1) + student.getIdNumber();
		return nickName;
	}

	public String getFollowedCourseName() {
		return followedCourseName;
	}

	public void setFollowedCourseName(String followedCourseName) {
		this.followedCourseName = followedCourseName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
