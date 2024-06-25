package org.themohit.SpringJDBCDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.themohit.SpringJDBCDemo.model.Student;
import org.themohit.SpringJDBCDemo.repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {
    StudentRepo repo;
    public void addStudent(Student s) {
        repo.save(s);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public StudentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }
}
