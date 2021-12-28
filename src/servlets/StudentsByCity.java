package servlets;

import db.DBManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/students-by-city")
public class StudentsByCity extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String cityName = request.getParameter("cityName");
        request.setAttribute("students", DBManager.getStudentsByCity(cityName));
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
