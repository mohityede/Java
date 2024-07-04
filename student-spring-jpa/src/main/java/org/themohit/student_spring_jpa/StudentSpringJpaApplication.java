package org.themohit.student_spring_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.themohit.student_spring_jpa.model.Student;
import org.themohit.student_spring_jpa.repository.StudentRepo;

import java.util.List;

@SpringBootApplication
public class StudentSpringJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(StudentSpringJpaApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

//		Student s1=context.getBean(Student.class);
//		Student s2=context.getBean(Student.class);
//		Student s3=context.getBean(Student.class);
//
//		s1.setName("mohit");
//		s1.setMarks(80);
//		s1.setRollNo(1);
//
//		s2.setName("Rohit");
//		s2.setMarks(88);
//		s2.setRollNo(2);
//
//		s3.setName("pohit");
//		s3.setMarks(39);
//		s3.setRollNo(3);
//
//		repo.save(s2);
//		repo.save(s3);

//		List<Student> lst=repo.findAll();
//		for(Student curr:lst) System.out.println(curr);

//		System.out.println(repo.findById(2));

//		List<Student> stud=repo.findByName("mohit");
//		System.out.println(stud);
//		System.out.println(repo.findByMarksGreaterThan(76));

		System.out.println(repo.findAll());
		Student s2=context.getBean(Student.class);

		s2.setName("Rohit");
		s2.setMarks(92);
		s2.setRollNo(2);

		repo.save(s2); // to update data
		System.out.println(repo.findAll());


		Student s3=context.getBean(Student.class);

		s3.setName("pohit");
		s3.setMarks(39);
		s3.setRollNo(3);

		repo.delete(s3);
		System.out.println(repo.findAll());

	}

}
