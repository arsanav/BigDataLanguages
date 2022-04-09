package com.company.Lab4;

import java.util.HashMap;

public abstract class Student implements Abiturient {
    private String name;
    private HashMap<String, String> results;

    public Student(String name){
        this.name = name;
        this.results = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void rateExam(String exam, String result) {
        this.results.put(exam, result);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", results=" + results +
                '}';
    }
}
