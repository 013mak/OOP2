package model;

import java.time.LocalDate;

public class Student extends User{
    private int studentId;

    public Student(String firstName, String lastName, String middleName, int studentId) {
        super(firstName, lastName, middleName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +getFirstName() + getLastName() + getMiddleName() + getStudentId() + '}';

    }
}
