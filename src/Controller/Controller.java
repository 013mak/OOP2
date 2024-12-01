package Controller;

import View.StudentView;
import model.*;
import service.DataService;
import service.StudentGroupService;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudentGroupService groupService = new StudentGroupService();

    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudents() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            view.printOnConsole((Student) user);
        }
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        groupService.studentGroupList(teacher, students);
    }

    public void getIds(List<User> studentGroup) {
        groupService.getUsersId(studentGroup);
    }

}
