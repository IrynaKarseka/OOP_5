package service;

import model.Student;
import model.StudentGroup;
import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        List<Student> listStudent = new ArrayList<>(studentList);
        return new StudentGroup(teacher, listStudent);
    }

}
