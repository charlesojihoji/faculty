package edu.uoengland.faculty.controllers;

import edu.uoengland.faculty.dto.FacultyDTO;
import edu.uoengland.faculty.dto.GradesDTO;
import edu.uoengland.faculty.dto.StudentDTO;
import edu.uoengland.faculty.feignclient.FacultyGradeServiceClient;
import edu.uoengland.faculty.feignclient.FacultyServiceClient;
//import edu.uoengland.faculty.feignclient.FacultyServiceClient2;
import edu.uoengland.faculty.service.FacultyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
	
	@Autowired
	private FacultyService facultyService;
	
	@Autowired
	private FacultyServiceClient facultyServiceClient;
	
	@Autowired
	private FacultyGradeServiceClient facultyGradeServiceClient;
	
	@PostMapping
	public FacultyDTO saveFaculty(@RequestBody FacultyDTO facultyDTO) {

		facultyDTO = facultyService.saveFaculty(facultyDTO);
		
		return facultyDTO;
	}

	@GetMapping
	public List<FacultyDTO> getAllFacultys(){

		List<FacultyDTO> facultyDTOList = facultyService.getAllFacultys();

		return facultyDTOList;
	}

	@GetMapping("/{id}")
	public FacultyDTO getAFaculty(@PathVariable UUID id){

		return facultyService.getAFaculty(id);
	}

	@PutMapping("/update/{id}")
	public String updateFaculty(@RequestBody FacultyDTO facultyDTO, @PathVariable UUID id){

		return facultyService.updateFaculty(facultyDTO, id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteFaculty(@PathVariable UUID id){

		return facultyService.deleteFaculty(id);
	}
	
	@GetMapping("/students")
	public List<StudentDTO> getAllStudents(){

		ResponseEntity<List<StudentDTO>> studentDTOList = facultyServiceClient.getAllStudents();
		return studentDTOList.getBody();
	}
	
	@PostMapping("/createGrade")
	public String facultyAddsAGrade(@RequestBody GradesDTO gradesDTO) {
		
		return facultyGradeServiceClient.createAGrade(gradesDTO);
	}
	
}
