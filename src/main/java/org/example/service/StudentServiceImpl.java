package org.example.service;

import org.example.dao.StudentDao;
import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;


    @Override
    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    @Override
    public Student getStudentById(Integer studentId) {
        return getStudentById(studentId);
    }
}
