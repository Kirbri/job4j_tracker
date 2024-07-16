package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Vasiliy Ivanovich Pupkin");
        student.setNumberOfGroup((short) 107);
        student.setDateOfReceipt(new Date());

        System.out.println("Student ," + student.getFullName() + ", entered " + student.getDateOfReceipt()
                + " in group - " + student.getNumberOfGroup());
    }
}
