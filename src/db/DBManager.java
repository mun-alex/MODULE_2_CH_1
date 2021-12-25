package db;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    public static List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }
}