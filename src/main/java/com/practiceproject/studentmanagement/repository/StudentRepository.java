package com.practiceproject.studentmanagement.repository;

import com.practiceproject.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
