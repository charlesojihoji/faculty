package edu.uoengland.students.service;

import edu.uoengland.students.dto.StudentDTO;
import edu.uoengland.students.entity.Student;

import java.util.List;
import java.util.UUID;

public interface StudentService {

	StudentDTO saveStudent(StudentDTO studentDTO);

	List<StudentDTO> getAllStudents();

	StudentDTO getAStudent(UUID id);

	String updateStudent(StudentDTO studentDTO, UUID id);

	String deleteStudent(UUID id);
}
