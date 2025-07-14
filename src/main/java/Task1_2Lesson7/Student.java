package Task1_2Lesson7;

import java.util.List;
import java.util.Scanner;

public class Student {
    private int id = 0;
    private String name;
    private String surname;
    private double gpa;

    Student(){};

    Student(int id, String name, String surname, double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getStudentData() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }


    public void addStudent(Scanner scanner, List<Student> students) {
        System.out.println("Adding student...");
        System.out.println("Please student name: ");
        this.name = scanner.next();
        System.out.println("Please student surname: ");
        this.surname = scanner.next();
        System.out.println("Please student gpa: ");
        this.gpa = scanner.nextDouble();

        students.add(new Student(id, name, surname, gpa));
        this.id++;

    }

    public void toStudentList(List<Student> students) {
        for(Student student: students){
            System.out.println(student.getStudentData());
        }

    }
}
