package org.themohit.spring_security_demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.themohit.spring_security_demo.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students=new ArrayList<>(Arrays.asList(new Student("Ram"),new Student("syam")));

    @GetMapping("/")
    public String getHome(HttpServletRequest req){
        return "Welcome home " + req.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @GetMapping("/student")
    public String getStudents(){
        return students.toString();
    }

    @PostMapping("/student/register")
    public String addStudent(@RequestBody Student student){
        students.add(student);
        return student+" added successfully";
    }
}
