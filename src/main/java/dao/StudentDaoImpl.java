package dao;

import pojo.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDaoImpl implements StudentDAO {

    private Map<Integer, Student> studentList;

    public StudentDaoImpl() {
        studentList = new HashMap<Integer, Student>();
    }

    public Map<Integer, Student> getAllStudents() {
        return studentList;
    }

    public Student getStudentByID(Integer id) {
        return studentList.get(id);
    }

    public void insertStudent(Integer id, Student student) {
        studentList.put(id, student);
    }

    public void deleteStudent(Integer id, Student student) {
        studentList.remove(id);
    }

}