package com.hibernate.controller;


import com.hibernate.repository.model.Room;
import com.hibernate.repository.model.Student;
import com.hibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("home");
        List<Student> students =  studentService.getAll();
        modelAndView.addObject("students", students);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Student student, int idClass){
        Room Room = new Room(1,"C04");
        student.setRoom(Room);
        studentService.addStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete")
    public ModelAndView delete(){
        ModelAndView modelAndView = new ModelAndView("delete");
        modelAndView.addObject("student", new Student());
        return modelAndView;
    }
}