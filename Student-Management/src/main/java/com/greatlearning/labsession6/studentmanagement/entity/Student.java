package com.greatlearning.labsession6.studentmanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentId")
	private int studentId;

	@Column(name = "firstName", columnDefinition = "varchar(50)")
	private String firstName;

	@Column(name = "lastName", columnDefinition = "varchar(50)")
	private String lastName;

	@Column(name = "course", columnDefinition = "varchar(50)")
	private String course;

	@Column(name = "country", columnDefinition = "varchar(50)")
	private String country;

	public Student(String firstName, String lastName, String course, String country) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.country = country;
	}
	
	
}
