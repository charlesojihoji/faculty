package edu.uoengland.faculty.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import edu.uoengland.faculty.dto.CourseDTO;

@FeignClient(name = "COURSES-SERVICE", url = "http://localhost:9696")
public interface FacultyCoursesServiceClient {

	@GetMapping("/courses")
	ResponseEntity<List<CourseDTO>> getAllCourses();
}
