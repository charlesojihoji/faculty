package edu.uoengland.students.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uoengland.students.dto.StudentDTO;
import edu.uoengland.students.entity.Student;
import edu.uoengland.students.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentDTO saveStudent(StudentDTO studentDTO) {

		Student stdnt = new Student();

		stdnt.setId(studentDTO.getId());
		stdnt.setFullName(studentDTO.getFullName());
		stdnt.setAddress(studentDTO.getAddress());
		stdnt.setPhoneNumber(studentDTO.getPhoneNumber());
		stdnt.setEmailAddress(studentDTO.getEmailAddress());
		stdnt.setGpa(studentDTO.getGpa());
		
		Student stdntDB = studentRepository.save(stdnt);

		//Convert the student object to its DTO equivalent

		studentDTO.setId(stdntDB.getId());

		return studentDTO;
	}

	@Override
	public List<StudentDTO> getAllStudents() {

		List<Student> studentList = studentRepository.findAll();

		List<StudentDTO> studentDTOList = new ArrayList<StudentDTO>();

		for(Student student: studentList){

			StudentDTO stdntDTO = new StudentDTO();

			stdntDTO.setId(student.getId());
			stdntDTO.setFullName(student.getFullName());
			stdntDTO.setAddress(student.getAddress());
			stdntDTO.setPhoneNumber(student.getPhoneNumber());
			stdntDTO.setEmailAddress(student.getEmailAddress());
			stdntDTO.setGpa(student.getGpa());

			studentDTOList.add(stdntDTO);
		}

		return studentDTOList;
	}

	@Override
	public StudentDTO getAStudent(UUID id) {

		Student student = studentRepository.findById(id).get();

		StudentDTO stdntDTO = new StudentDTO();

		stdntDTO.setId(student.getId());
		stdntDTO.setFullName(student.getFullName());
		stdntDTO.setAddress(student.getAddress());
		stdntDTO.setPhoneNumber(student.getPhoneNumber());
		stdntDTO.setEmailAddress(student.getEmailAddress());
		stdntDTO.setGpa(student.getGpa());

		return stdntDTO;
	}

	@Override
	public String updateStudent(StudentDTO studentDTO, UUID id) {

		Student student = studentRepository.findById(id).get();

		student.setFullName(studentDTO.getFullName());
		student.setAddress(studentDTO.getAddress());
		student.setPhoneNumber(studentDTO.getPhoneNumber());
		student.setEmailAddress(studentDTO.getEmailAddress());
		student.setGpa(studentDTO.getGpa());

		//Save the updated student information in the database
		studentRepository.save(student);

		return "The Student has been successfully updated";
	}

	@Override
	public String deleteStudent(UUID id) {

		studentRepository.deleteById(id);

		return "The Student object with ID " + id + " has been successfully deleted";
	}

}
