package dao;

import pojo.Lecturer;

import java.util.Map;

public interface LecturerDAO {

    Map<Integer, Lecturer> getAllLecturers();
    Lecturer getLecturerByID(Integer id);
    void insertLecturer(Integer id, Lecturer lecturer);
    void deleteLecturer(Integer id);

}