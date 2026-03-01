package com.practiceproject.studentmanagement.controller;

import com.practiceproject.studentmanagement.entity.Course;
import com.practiceproject.studentmanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService){
        this.courseService = courseService;
    }

//    Create course
    @PostMapping
    public Course createCourse(@RequestBody Course course){
        return courseService.createCourse(course);
    }

//    Get all course
    @GetMapping
    public List<Course> getAllCourse(){
        return courseService.getAllCourses();
    }
}
