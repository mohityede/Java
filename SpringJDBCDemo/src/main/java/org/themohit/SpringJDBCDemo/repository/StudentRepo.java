package org.themohit.SpringJDBCDemo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.themohit.SpringJDBCDemo.model.Student;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    private JdbcTemplate jdbc;
    public void save(Student s) {
        String query= "insert into student (rollNo,name,marks) values (?,?,?);";
        int rowsCount= jdbc.update(query,s.getRollNo(),s.getName(),s.getMarks());
        System.out.println(rowsCount+" records added");
    }

    public List<Student> findAll() {
        String query="select * from student;";
        RowMapper<Student> mapper=(rs, rowNum) ->{
                Student newS=new Student();
                newS.setRollNo(rs.getInt("rollNo"));
                newS.setName(rs.getString("name"));
                newS.setMarks(rs.getInt("marks"));
                return newS;
        };
        return jdbc.query(query,mapper);
    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
}
