package com.company;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    //constructor: prom user to enter student's name + year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextLine();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    //generate an id
    private void setStudentID() {
        id++;
        //grade level + id
        this.studentID = gradeYear + "" + id;

    }

    //enroll in courses
    public void enroll() {
        //Get inside a loop , user hits 0
        do {
            System.out.println("Enter course to enroll (Q to quit)");
            Scanner in = new Scanner (System.in);
            String course = in.nextLine();

            if(!course.equalsIgnoreCase("Q")){
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { break; }
        } while (1 != 0);



        System.out.println("ENROLLED IN: " + courses);
        System.out.println("TUITION BALANCE: " + tuitionBalance);


    }

    //TODO: view balance

    //TODO: pay tuition

    //TODO: show status

}
