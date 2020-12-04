package dao;

import pojo.Student;
import java.util.Map;

public interface StudentDAO {

    Map<Integer, Student> getAllStudents();
    Student getStudentByID(Integer id);
    void insertStudent(Integer id, Student student);
    void deleteStudent(Integer id, Student student);

}