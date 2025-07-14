package Task1_2Lesson7;

import java.util.*;


public class Main {

    static String topStudent(List<Student> students){
        double gpa_max = 0;
        String topStudent = null;
        for (Student student: students){
            if(student.getGpa() > gpa_max){
                gpa_max = student.getGpa();
                topStudent = student.getStudentData();
            }
        }
        return topStudent;

    }

    public static void main(String[] args) {
        Student student1 = new Student(1,"Natavan","Pashayeva",3.6);
        Student student2 = new Student(2,"Fidan","Pashayeva",3.0);
        Student student3 = new Student(3,"Khanmad","Pashayev",2.7);
        Student student4 = new Student(4,"Zulfiyya","Huseynova",4.0);
        Student student5 = new Student(5,"Toghrul","Pashayev",2.0);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (Student student: students){
            System.out.println(student.getStudentData());
        }

        System.out.println("The top student is: " + topStudent(students));


    }
}