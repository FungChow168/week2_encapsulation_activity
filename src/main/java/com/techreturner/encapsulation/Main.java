package com.techreturner.encapsulation;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> tmp = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F"));
        System.out.println(tmp.indexOf("A"));

        Student aStudent = new Student("John", "F", 2);
        aStudent.downgradeStudentGrade();
        System.out.println(aStudent.getStudentGrade());
        System.out.println(aStudent.getStudentName());
        aStudent.downgradeStudentGrade();
        System.out.println(aStudent.getStudentGrade());

        School aSchool = new School();
        aSchool.addStudent("Peter", "C", 2);
        aSchool.addStudent("Paul", "B", 3);
        aSchool.addStudent("Mary", "A", 1);
        aSchool.addStudent("John", "F", 5);
        aSchool.listAllStudent();


        aSchool.upgradeResult("Paul");
        aSchool.downgradeResult("Peter");
        aSchool.upgradeResult("Mary");
        aSchool.downgradeResult("John");
        aSchool.listAllStudent();
//        testing invalid Grade.  An exception should be thrown.
//        Student student_B = new Student("John", "K", 2);
    }
}
