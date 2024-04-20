package org.example.client;

import org.example.config.AppConfig;
import org.example.model.Student;
import org.example.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentService studentService = context.getBean(StudentService.class);

        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);

        student1.setStudentId(1);
        student1.setStudentName("Ketan");
        student1.getAddress().setCity("Pune");

        student2.setStudentId(2);
        student2.setStudentName("Kartik");
        student2.getAddress().setCity("Nagar");

        studentService.addStudent(student1);
        studentService.addStudent(student2);

        System.out.println("Student Data added");
    }
}
