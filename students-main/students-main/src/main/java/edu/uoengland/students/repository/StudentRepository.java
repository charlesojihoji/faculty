package edu.uoengland.students.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.uoengland.students.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID>{

}
