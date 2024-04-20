package org.example.dao;

import org.example.model.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    Student addStudent(Student student);
    Student getStudentById(Integer studentId);
}
