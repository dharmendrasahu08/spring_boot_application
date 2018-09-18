package com.demo;

public class StudentApiImpl implements StudentApi {

	public Student getStudent(int studentId) {
		System.out.println("***getStudent***");
		return new Student(studentId, "Name:"+studentId, true);
	}

	public Student saveStudent(Student payload) {
		System.out.println("***saveStudent***");
		payload.setStdStatus(true);
		return payload;
	}

}
