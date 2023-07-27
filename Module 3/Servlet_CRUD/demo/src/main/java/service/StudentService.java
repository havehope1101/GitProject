package service;

import service.iService.iStudentService;
import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements iStudentService<Student> {
        List<Student> students = new ArrayList<>();

        public StudentService() {
            this.students.add(new Student(1, "tuan",20,  "123.jpg"));
            this.students.add(new Student(2, "ngoc",25,  "456.jpg"));
        }

    @Override
    public List findAll() {
        return this.students;
    }

    @Override
    public void add(Student student) {
        this.students.add(student);
    }


    @Override
    public void delete(int id) {
            int index = this.findById(id);
        this.students.remove(index);
    }

    @Override
    public int findById(int id) {
        for (int i = 0; i <this.students.size() ; i++) {
            if(id == students.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(int id, Student student) {
        int index = this.findById(id);
        this.students.set(index, student);
    }
}
