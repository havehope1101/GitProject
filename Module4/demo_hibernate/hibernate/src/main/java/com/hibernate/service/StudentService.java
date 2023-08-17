package com.hibernate.service;

import com.hibernate.dao.StudentDAO;
import com.hibernate.repository.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> getAll() {
        return studentDAO.getAll();
    }

    public void addStudent(Student student){
        studentDAO.addStudent(student);
    }

    public void editStudent(Student student){
        studentDAO.editStudent(student);
    }

    public Student findById(int id){
        return studentDAO.findById(id);
    }

    public void deleteStudent(Student student){
        studentDAO.deleteStudent(student);
    }
}
