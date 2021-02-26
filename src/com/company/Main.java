package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        student1.showStatus();

        //Ask how many users we want to add
        System.out.print("Enter nubmer of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        //create n number of new students
        Student[] students = new Student[numOfStudents];
        for(int n = 0; n < numOfStudents; n++) {
            Student student = new Student();
            student.enroll();
            student.payTuition();
            student.showStatus();

        }
    }
}
