package service;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {

    private List<User> userList;

    public void create(String firstName, String lastName, String middleName, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(firstName, lastName, middleName, id);
            userList.add(student);
        }
        else if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(firstName, lastName, middleName, id);
            userList.add(teacher);
        }
    }
    public User getUserById(Type type, Integer id) {
        boolean itsStudent = Type.STUDENT == type;
        User currentUser = null;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                currentUser = user;
            }
            if (user instanceof Student && itsStudent) {
                currentUser = user;
            }
        }
        return currentUser;
    }

    public List<User> getUserList() {
        return userList;
    }
    public List<User> getAllStudent() {
        List<User> studentList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                studentList.add(user);
            }
        }
        return studentList;
    }

    private int getFreeId (Type type) {
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent) {
                lastId = ((Teacher)user).getTeacherId() + 1;
            }
            if (user instanceof Student && itsStudent) {
                lastId = ((Student)user).getStudentId() + 1;
            }
        }
        return lastId;
    }

}
