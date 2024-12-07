package edu.uoengland.students.controllers;

import edu.uoengland.students.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.uoengland.students.dto.StudentDTO;
import edu.uoengland.students.service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/students")
public class StudentController {

	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public StudentDTO saveStudent(@RequestBody StudentDTO studentDTO) {
		
		StudentDTO stdntDTO = studentService.saveStudent(studentDTO);
		
		return stdntDTO;
	}

	@GetMapping
	public List<StudentDTO> getAllStudents(){

		List<StudentDTO> sdntDTOList = studentService.getAllStudents();

		return sdntDTOList;
	}

	@GetMapping("/{id}")
	public StudentDTO getAStudent(@PathVariable UUID id){

		return studentService.getAStudent(id);
	}

	@PutMapping("/update/{id}")
	public String updateStudent(@RequestBody StudentDTO studentDTO, @PathVariable UUID id){

		return studentService.updateStudent(studentDTO, id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable UUID id){

		return studentService.deleteStudent(id);
	}
}
