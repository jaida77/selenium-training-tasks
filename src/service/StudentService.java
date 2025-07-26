package service;

import model.Student;

public class StudentService {
    public void saveStudent(Student s) {
        System.out.println("Student saved: " + s.name);
    }

    public void printStudent(Student s) {
        System.out.println("ID: " + s.id + ", Name: " + s.name);
    }
}