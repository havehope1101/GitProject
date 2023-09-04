package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String address;
    private String number;
    private String email;
    @ManyToOne
    private Classroom classroom;

    public Student(int id, String name, LocalDate dateOfBirth, String address, String number, String email, Classroom classroom) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.number = number;
        this.email = email;
        this.classroom = classroom;
    }

    public Student(int id, String name, LocalDate dateOfBirth, String address, String number, String email) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.number = number;
        this.email = email;
    }
}
