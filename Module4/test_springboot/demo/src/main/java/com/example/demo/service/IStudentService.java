package com.example.demo.service;

import com.example.demo.model.Classroom;
import com.example.demo.model.Student;

public interface IStudentService extends IService<Student>{
    void save(Student student, int idClassroom);
}
