package db;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class DBManager {

    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("Azhar", "Ebekenova", "Seoul"));
        studentList.add(new Student("Islam", "Ibragimov", "Almaty"));
        studentList.add(new Student("Beka", "Bakyttaev", "Astana"));
        studentList.add(new Student("Aisulu", "Kanatkyzy", "Almaty"));
    }

    public static List<Student> getAllStudents() {
        return studentList;
    }

    public static List<Student> getStudentsByCity(String cityName) {
        List<Student> studentsByCity = new ArrayList<>();

        for (Student student : studentList) {
            if (student.getCity().equals(cityName)) {
                studentsByCity.add(student);
            }
        }
        return studentsByCity;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}