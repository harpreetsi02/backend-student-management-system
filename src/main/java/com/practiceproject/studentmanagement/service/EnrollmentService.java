package com.practiceproject.studentmanagement.service;

import com.practiceproject.studentmanagement.entity.Course;
import com.practiceproject.studentmanagement.entity.Enrollment;
import com.practiceproject.studentmanagement.entity.Student;
import com.practiceproject.studentmanagement.repository.CourseRepository;
import com.practiceproject.studentmanagement.repository.EnrollmentRepository;
import com.practiceproject.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentService(
            EnrollmentRepository enrollmentRepository,
            StudentRepository studentRepository,
            CourseRepository courseRepository
    ){
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public Enrollment enrollStudent(Long studentId, Long courseId){
        if(enrollmentRepository.existsByStudentIdAndCourseId(studentId, courseId)){
            throw new RuntimeException("Student already enrolled in the course");
        }

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));
        Enrollment enrollment = new Enrollment(student, course);

        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getEnrollmentsByCourse(Long courseId){
        return enrollmentRepository.findByCourseId(courseId);
    }

    public List<Enrollment> getEnrollmentByStudent(Long studentId){
        return enrollmentRepository.findByStudentId(studentId);
    }
}
