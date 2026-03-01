package com.practiceproject.studentmanagement.controller;

import com.practiceproject.studentmanagement.entity.Course;
import com.practiceproject.studentmanagement.entity.Enrollment;
import com.practiceproject.studentmanagement.service.CourseService;
import com.practiceproject.studentmanagement.service.EnrollmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    public EnrollmentController(EnrollmentService enrollmentService){
        this.enrollmentService = enrollmentService;
    }

//    Enroll student into course
    @PostMapping
    public Enrollment enrollStudent(@RequestParam Long studentId, @RequestParam Long courseId){
        return enrollmentService.enrollStudent(studentId, courseId);
    }

//    Get students of course
    @GetMapping("/course/{courseId}")
    public List<Enrollment> getStudentsOfCourse(@PathVariable Long courseId){
        return enrollmentService.getEnrollmentsByCourse(courseId);
    }

//    Get Courses of student
    @GetMapping("/student/{studentId}")
    public List<Enrollment> getCoursesOfStudent(@PathVariable Long studentId){
        return enrollmentService.getEnrollmentByStudent(studentId);
    }
}
