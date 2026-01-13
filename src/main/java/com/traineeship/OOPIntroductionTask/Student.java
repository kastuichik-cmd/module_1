package com.traineeship.OOPIntroductionTask;

public class Student {
    private final String name;
    private final int age;
    private final double averageGrade;


    public Student(String name, int age, double averageGrade) {
        this.name = name;
        this.age = age;
        this.averageGrade = averageGrade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", averageGrade=" + averageGrade;
    }
}
