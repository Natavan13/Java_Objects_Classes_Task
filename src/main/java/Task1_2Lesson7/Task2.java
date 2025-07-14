package Task1_2Lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        List<Student> students = new ArrayList<>();

        while(true) {
            System.out.println(
                    "PRESS [1] TO ADD STUDENT\n" +
                            "PRESS [2] TO STUDENT LIST\n" +
                            "PRESS [0] TO EXIT");
            System.out.println("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1: student.addStudent(scanner, students);
                    break;
                case 2: student.toStudentList(students);
                    break;
                case 0: System.exit(1);
                    break;
            }
        }

    }
}

