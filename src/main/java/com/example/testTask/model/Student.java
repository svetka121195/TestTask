package com.example.testTask.model;

import javax.persistence.*;

/**
 * Created by Светлана on 11.08.2019.
 */
@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 256, nullable = false)
	private String firstName;
	@Column(length = 256, nullable = false)
	private String lastName;
	@Column(nullable = false)
	private int course;

	public Student() {
	}

	public Student(long id, String firstName, String lastName, int course) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		if (id != student.id) return false;
		if (course != student.course) return false;
		if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
		return lastName != null ? lastName.equals(student.lastName) : student.lastName == null;
	}

	@Override
	public int hashCode() {
		int result = (int) (id ^ (id >>> 32));
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
		result = 31 * result + course;
		return result;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", course=" + course +
				'}';
	}
}
