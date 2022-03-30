package com.techreturner.encapsulation;

import java.util.*;

public class Student {

    private String name;
    private String grade;
    private int group;
    private String secretNickName = "MySecretNickName";
    private final ArrayList<String> GRADElIST = new ArrayList<String>(Arrays.asList("F","E","D","C","B","A"));
    private final int MAXGROUPNUMBER = 5;
    private final int MINGROUPNUMBER = 1;
    private final int DEFAULTGROUPNUMBER = 1;

    public Student(String studentName, String grade, int group){
        this.name = studentName;
        if (GRADElIST.indexOf(grade) == -1)
            throw new UnsupportedOperationException("invalid grade");
        this.grade = grade;
        if (group >= MINGROUPNUMBER && group <= MAXGROUPNUMBER)
            this.group = group;
        else
            this.group = DEFAULTGROUPNUMBER;
    }

    public String getStudentGrade(){
        return grade;
    }

    public String getStudentName(){
        return name;
    }

    public int getStudentGroup(){
        return group;
    }

    public void upgradeStudentGrade(){
        int currentGradeIndex = GRADElIST.indexOf(grade);
        if (currentGradeIndex < GRADElIST.size() - 1){
            grade = GRADElIST.get(currentGradeIndex + 1);
        }
    }

    public void downgradeStudentGrade(){
        int currentGradeIndex = GRADElIST.indexOf(grade);
        if (currentGradeIndex > 0){
            grade = GRADElIST.get(currentGradeIndex - 1);
        }
    }
}
