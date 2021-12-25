package servlets;


import db.DBManager;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.print("<h2>Hello Islam</h2>");
        request.getRequestDispatcher("/index.html").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("studentName");
        String studentSurname = request.getParameter("studentSurname");
        String studentCity = request.getParameter("studentCity");
        Student student = new Student(studentName, studentSurname, studentCity);
        DBManager dbManager = new DBManager();
        dbManager.addStudent(student);
        request.getRequestDispatcher("/students.jsp").forward(request, response);
    }
}
