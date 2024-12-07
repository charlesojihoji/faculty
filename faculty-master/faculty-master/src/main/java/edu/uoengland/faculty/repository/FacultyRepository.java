package edu.uoengland.faculty.repository;

import edu.uoengland.faculty.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, UUID>{

}
