package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.impl.ClassroomServiceImpl;
import com.example.demo.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class StudentController {
    @Autowired
    ClassroomServiceImpl classroomService;

    @Autowired
    StudentServiceImpl studentService;

    @GetMapping("")
    public List<Student> getAll() {
    return studentService.getAll();
    }

    @GetMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        studentService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Student student){
        studentService.add(student);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @PostMapping("edit/{id}")
    public ResponseEntity<Student> edit(@RequestBody Student student, @PathVariable int id){
        if(student.getId()==id) {
            return new ResponseEntity<>(studentService.update(student),HttpStatus.OK);
        } else return null;
    }

    @GetMapping("edit/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.findById(id);
    }

    @GetMapping("/search/{name}")
    public List<Student>findByName(@PathVariable String name){
        return studentService.findByName(name);
    }
}
