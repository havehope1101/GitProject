package com.example.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Servlet", value = "/11")
public class Servlet extends HttpServlet {

    private List<Student> getStudentData() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alice", 20, 85.5));
        studentList.add(new Student("Bob", 21, 78.2));
        studentList.add(new Student("Charlie", 19, 90.0));
        return studentList;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = getStudentData();

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Student List</title></head>");
        out.println("<body>");
        out.println("<h1>Student List</h1>");
        out.println("<ul>");
        for (Student student : studentList) {
            out.println("<li>" + student.getName() + ", Age: " + student.getAge() + ", Score: " + student.getScore() + "</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
