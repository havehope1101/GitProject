package com.example.demo.service.impl;

import com.example.demo.model.Classroom;
import com.example.demo.repository.ClassroomRepository;
import com.example.demo.service.IClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomServiceImpl implements IClassroomService {
    @Autowired
    ClassroomRepository classroomRepository;

    @Override
    public List<Classroom> getAll() {
        return (List<Classroom>) classroomRepository.findAll();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void add(Classroom classroom) {

    }

    @Override
    public Classroom update(Classroom classroom) {
        return classroom;
    }

    @Override
    public Classroom findById(int id) {
        return classroomRepository.findById(id).get();
    }
}
