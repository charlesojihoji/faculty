package edu.uoengland.faculty.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import edu.uoengland.faculty.dto.GradesDTO;

@FeignClient(name = "GRADING-SYSTEM-SERVICE", url = "http://localhost:9292")
public interface FacultyGradeServiceClient {

    @PostMapping("/grades")
    String createAGrade(GradesDTO gradesDTO);
}