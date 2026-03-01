package com.practiceproject.studentmanagement.service;

import com.practiceproject.studentmanagement.entity.Student;
import com.practiceproject.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

//    Create student
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

//    Get all students
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

//    Delete student by id
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}
