package com.example.studentregistration;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    public List<Classroom> classrooms = new ArrayList<>();
    public List<Student> students = new ArrayList<>();

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
