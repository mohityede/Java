package org.themohit.student_spring_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.themohit.student_spring_jpa.model.Student;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
//    @Query("select s from Student s where name = ?1")
    List<Student> findByName(String n);

    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);
}
