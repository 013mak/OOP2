package model;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {


    private List<User> students;
    private Teacher teacher;

    public StudentGroup(List<Student> students, Teacher teacher) {
        List<User> studentList = new ArrayList<>(students);
        this.students = studentList;
        this.teacher = teacher;

    }
}
