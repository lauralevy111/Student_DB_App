package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        student1.showStatus();

         */

        //Ask how many users we want to add
        System.out.print("Enter nubmer of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];


        //create n number of new students
        for(int n = 0; n < numOfStudents; n++) {
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();

        }
        // print all students' data
        for (Student student: students) {
            student.showStatus();
        }
    }
}
