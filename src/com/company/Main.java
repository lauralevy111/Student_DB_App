package com.company;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.enroll();
        student1.payTuition();
        student1.showStatus();

        Student student2 = new Student();
        student2.enroll();
        student2.payTuition();
        student2.showStatus();

        Student student3 = new Student();
        student3.enroll();
        student3.payTuition();
        student3.showStatus();

        //TODO: Ask how many users we want to add

        //TODO: create n number of new studnts
    }
}
