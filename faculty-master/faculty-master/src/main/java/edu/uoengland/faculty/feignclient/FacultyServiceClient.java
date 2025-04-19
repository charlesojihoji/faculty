package edu.uoengland.faculty.feignclient;

import edu.uoengland.faculty.dto.StudentDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "STUDENT-SERVICE", url = "http://localhost:9191")
public interface FacultyServiceClient {

    @GetMapping("/students")
    ResponseEntity<List<StudentDTO>> getAllStudents();
}