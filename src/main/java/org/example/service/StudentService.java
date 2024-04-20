package org.example.service;

import org.example.dao.StudentDao;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {

    Student addStudent(Student student);
    Student getStudentById(Integer studentId);

}
