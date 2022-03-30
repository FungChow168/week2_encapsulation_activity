package com.techreturner.encapsulation;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {

    @Test
    public void checkGetStudentGrade() {
        Student student_01 = new Student("Paul", "E", 1);
        assertEquals("E", student_01.getStudentGrade());
    }

    @Test
    public void checkGetStudentName() {
        Student student_02 = new Student("Mary", "A", 1);
        assertEquals("Mary", student_02.getStudentName());
    }

    @Test
    public void checkStudentUpgrade() {
        Student student_03 = new Student("Johan", "C", 3);
        student_03.upgradeStudentGrade();
        assertEquals("B", student_03.getStudentGrade());
    }

    @Test
    public void checkAGradeCannotBeUpgraded() {
        Student student_04 = new Student("John", "A", 3);
        student_04.upgradeStudentGrade();
        assertEquals("A", student_04.getStudentGrade());
    }

    @Test
    public void checkStudentDowngrade() {
        Student student_05 = new Student("Peter", "A", 1);
        student_05.downgradeStudentGrade();
        assertEquals("B", student_05.getStudentGrade());
    }

    @Test
    public void checkFGradeCannotBeDowngrade() {
        Student student_06 = new Student("William", "F", 1);
        student_06.downgradeStudentGrade();
        assertEquals("F", student_06.getStudentGrade());
    }
}