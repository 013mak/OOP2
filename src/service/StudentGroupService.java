package service;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {
    private List<User> studentGroup;

    public List<User> studentGroupList(Teacher teacher, List<Student> studentList) {
        studentGroup.add(teacher);
        for (Student student : studentList) {
            studentGroup.add(student);
        }

     return studentGroup;
    }

    public void getUsersId (List<User> studentGroup) {
        for (User user : studentGroup) {
        if (user instanceof Teacher) {
            System.out.println("The teacher is" + ((Teacher) user).getTeacherId());}
        else if (user instanceof Student) {
            System.out.println("The student is" + ((Student) user).getStudentId());
        }
        }

    }


}
