package com.example.demo.service.impl;

import com.example.demo.model.Classroom;
import com.example.demo.model.Student;
import com.example.demo.repository.ClassroomRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ClassroomRepository classroomRepository;

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void add(Student student) {
        studentRepository.save(student);
    }

    public void save(Student student, int idClassroom) {
        Classroom classroom = classroomRepository.findById(idClassroom).get();
        student.setClassroom(classroom);
        studentRepository.save(student);
    }

//    @Override
//    public Student update(Student student) {
//        Optional<Student> optinalStudent = studentRepository.findById(student.getId());
//        if(optinalStudent.isPresent()) {
//            Student studentUpdate = optinalStudent.get();
//            studentUpdate.
//        }
//
//        return studentRepository.save(student);
//    }

    @Override
    public Student update(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student findById(int id) {
        Optional<Student>optinalStudent =studentRepository.findById(id);
        if(optinalStudent.isPresent()){
            return optinalStudent.get();
        } else {
            return new Student();
        }
    }

    public List<Student> findByName(String name) {
        return studentRepository.getAllByNameSQL(name);
    }
}
