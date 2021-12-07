package com.example.studentregistration;

import java.util.List;
import java.util.UUID;

public class Classroom {

    private final UUID id;
    private String name;

    public static List<Classroom> defaultClasses() {
        return List.of(
                new Classroom("Painting Fundamental"),
                new Classroom("Computer Basic"),
                new Classroom("English Four Skills"),
                new Classroom("Intermediate Chinese Speaking")
        );
    }

    public Classroom(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public Classroom() {
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
