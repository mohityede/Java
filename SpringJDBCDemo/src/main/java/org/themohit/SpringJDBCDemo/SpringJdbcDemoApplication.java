package org.themohit.SpringJDBCDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.themohit.SpringJDBCDemo.model.Student;
import org.themohit.SpringJDBCDemo.service.StudentService;

import java.util.List;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringJdbcDemoApplication.class, args);
		System.out.println("New Spring project");

		Student s= context.getBean(Student.class);
		s.setRollNo(21);
		s.setName("Mohit");
		s.setMarks(83);
//		System.out.println(s);

		StudentService service=context.getBean(StudentService.class);
//		service.addStudent(s);
		List<Student> students= service.getStudents();
//		System.out.println(students);
		for(Student curr:students){
			System.out.println(curr);
		}

	}
}
