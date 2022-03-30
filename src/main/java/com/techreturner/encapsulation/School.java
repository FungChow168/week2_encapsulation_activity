package com.techreturner.encapsulation;

import java.util.ArrayList;

public class School {

    ArrayList<Student> students = new ArrayList<Student> ();


    public void addStudent(String name, String grade, int group){
        students.add(new Student(name, grade, group));
    }

    public void upgradeResult(String studentName){
        for(Student aStudent: students)
            if (aStudent.getStudentName().equals(studentName))
                aStudent.upgradeStudentGrade();
    }

    public void downgradeResult(String studentName){
        for(Student aStudent: students)
            if (aStudent.getStudentName().equals(studentName))
                aStudent.downgradeStudentGrade();
    }

    public void listAllStudent(){
        for(Student aStudent: students)
            System.out.println(String.format("Name: %s, Grade: %s, Group: %s",
                                           aStudent.getStudentName(), aStudent.getStudentGrade(),
                                           aStudent.getStudentGroup()));
    }

}
