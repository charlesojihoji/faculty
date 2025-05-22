package edu.uoengland.faculty.feignclient;

import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import edu.uoengland.faculty.dto.GradesDTO;

@FeignClient(name = "GRADING-SYSTEM-SERVICE", url = "http://localhost:9292")
public interface FacultyGradeServiceClient {

    @PostMapping("/grades")
    String createAGrade(GradesDTO gradesDTO);

    @PutMapping("/grades/{gradeId}")
	String updateGrade(GradesDTO gradesDTO, UUID gradeId);
}