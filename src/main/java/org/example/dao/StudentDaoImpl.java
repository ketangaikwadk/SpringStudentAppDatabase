package org.example.dao;

import org.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StudentDaoImpl implements StudentDao{

    @Autowired
    private List<Student> database;

    @Autowired
    private ApplicationContext context;

    @Override
    public Student addStudent(Student student) {
        database.add(student);
        return student;
    }

    @Override
    public Student getStudentById(Integer studentId) {
       return database.stream().filter(student -> student.getStudentId()==studentId).collect(Collectors.toList()).get(0);
    }
}
