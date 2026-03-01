package com.practiceproject.studentmanagement.service;

import com.practiceproject.studentmanagement.entity.Course;
import com.practiceproject.studentmanagement.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

//    Create course
    public Course createCourse(Course course){
        return courseRepository.save(course);
    }

//    Get all course
    public List<Course> getAllCourses(){
        return courseRepository.findAll();
    }
}
