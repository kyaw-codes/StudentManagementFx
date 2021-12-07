package com.example.studentregistration;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Student {
    private final UUID id;
    private String name;
    private String nrc;
    private Classroom classroom;
    private LocalDate dob;

    public Student() {
        this.id = UUID.randomUUID();
    }

    public static List<Student> defaultStudents() {
        return List.of(
                new Student("Mg Mg", "12/TNN(N)431211", Classroom.defaultClasses().get(2), LocalDate.now()),
                new Student("Su Su", "11/MYK(N)532124", Classroom.defaultClasses().get(1), LocalDate.now())
        );
    }

    public Student(String name, String nrc, Classroom classroom, LocalDate dob) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.nrc = nrc;
        this.classroom = classroom;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getClassroomName() {
        return this.classroom.getName();
    }
}
