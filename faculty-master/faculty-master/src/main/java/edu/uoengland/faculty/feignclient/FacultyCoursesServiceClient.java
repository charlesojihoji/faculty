package edu.uoengland.faculty.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.uoengland.faculty.dto.CourseDTO;

@FeignClient(name = "COURSES-SERVICE", url = "http://localhost:9696")
public interface FacultyCoursesServiceClient {

	@GetMapping("/courses")
	ResponseEntity<List<CourseDTO>> getAllCourses();

	@GetMapping("/courses/faculty/{facultyName}")
	ResponseEntity<List<CourseDTO>> getAllCoursesForAFacultyMember(@PathVariable String facultyName);

	@GetMapping("/courses/{facultyName}/{courseName}")
	CourseDTO getDetailsOfACourseFOrAFacultyMember(@PathVariable String facultyName, @PathVariable String courseName);
}
