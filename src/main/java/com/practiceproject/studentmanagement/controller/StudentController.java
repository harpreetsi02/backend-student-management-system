package com.practiceproject.studentmanagement.controller;

import com.practiceproject.studentmanagement.entity.Student;
import com.practiceproject.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

//    Create student
    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

//    Get all students
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

//    Delete student
    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}
