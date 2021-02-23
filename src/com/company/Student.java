package com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private int studentID;
    private String courses;
    private String tuitionBalance;
    private int costOfCourse;

    //constructor: prom user to enter student's name + year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        System.out.println(firstName + " " + lastName + " " + gradeYear);

    }

    //TODO: generate an id

    //TODO: enroll in courses

    //TODO: view balance

    //TODO: pay tuition

    //TODO: show status

}
