package com.example.studentregistration;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    List<Classroom> classrooms = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    private static DataStore instance;

    public static DataStore getInstance() {
        if (instance == null) {
            instance = new DataStore();
        }
        return instance;
    }

    private DataStore() {
        classrooms.addAll(Classroom.defaultClasses());
        students.addAll(Student.defaultStudents());
    }
}
