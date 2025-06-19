package edu.uoengland.faculty.feignclient;

import java.util.List;
import java.util.UUID;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import edu.uoengland.faculty.dto.GradesDTO;

@FeignClient(name = "GRADING-SYSTEM-SERVICE", url = "http://localhost:9292")
public interface FacultyGradeServiceClient {

    @PostMapping("/grades")
    String createAGrade(GradesDTO gradesDTO);

    @PutMapping("/grades/{gradeId}")
	String updateGrade(@RequestBody GradesDTO gradesDTO, @PathVariable UUID gradeId);
    
    @DeleteMapping("grades/{gradeId}")
    String deleteGrade(@PathVariable UUID gradeId);
    
    @GetMapping("grades/studentsGrades/{course}")
    List<String> getAllGradesForACourse(@PathVariable String course);
}