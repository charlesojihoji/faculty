package edu.uoengland.faculty.service;


import edu.uoengland.faculty.dto.FacultyDTO;

import java.util.List;
import java.util.UUID;

public interface FacultyService {

	FacultyDTO saveFaculty(FacultyDTO facultyDTO);

	List<FacultyDTO> getAllFacultys();

	FacultyDTO getAFaculty(UUID id);

	String updateFaculty(FacultyDTO facultyDTO, UUID id);

	String deleteFaculty(UUID id);
}
