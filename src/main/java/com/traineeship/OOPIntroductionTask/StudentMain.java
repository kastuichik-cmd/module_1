package com.traineeship.OOPIntroductionTask;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Паша", 28, 7.0),
                new Student("Лера", 27, 9.7),
                new Student("Маша", 29, 8.2),
                new Student("Света", 27, 6.8));

        double maxAverageGrade = students.stream()
                .mapToDouble(Student::getAverageGrade)
                .max()
                .orElseThrow();

        students.stream()
                .filter(student -> student.getAverageGrade() == maxAverageGrade)
                .forEach(student -> System.out.println("Cтудент с наивысшим средним баллом: " + student));
    }
}
