package edu.uoengland.faculty.dto;

import java.util.UUID;

public class GradesDTO {

	private String studentsFullName;
	
	private String course;

	private String grade;
	
	private UUID gradeId;

	public GradesDTO() {
		super();
	}

	public GradesDTO(String studentsFullName, String course, String grade, UUID gradeId) {
		super();
		this.studentsFullName = studentsFullName;
		this.course = course;
		this.grade = grade;
		this.gradeId = gradeId;
	}

	public String getStudentsFullName() {
		return studentsFullName;
	}

	public void setStudentsFullName(String studentsFullName) {
		this.studentsFullName = studentsFullName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public UUID getGradeId() {
		return gradeId;
	}

	public void setGradeId(UUID gradeId) {
		this.gradeId = gradeId;
	}

}
