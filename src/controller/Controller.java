package controller;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView view = new StudentView();


    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        // Создать метод в Контроллере,
        // в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id)
        // и формирования учебной группы, путем вызова метода из сервиса.????? группа из id-шников, что ли?
        // Как поняла, так и реализовала.(Плохо объяснили!!!)
        return studentGroupService.createStudentGroup(teacher, students);
    }
    public void createStudent(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String lastName, String middleName) {
        service.create(firstName, lastName, middleName, Type.TEACHER);
    }
    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
    public List<User> getAllUser(){
        return service.getAllUsers();
    }
}
