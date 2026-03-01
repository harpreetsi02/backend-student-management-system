package com.practiceproject.studentmanagement.repository;

import com.practiceproject.studentmanagement.entity.Course;
import com.practiceproject.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
