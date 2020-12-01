package dao;

import pojo.Lecturer;

import java.util.HashMap;
import java.util.Map;

public class LecturerDaoImpl implements LecturerDAO {

    private Map<Integer, Lecturer> lecturerList;

    public LecturerDaoImpl() {
        lecturerList = new HashMap<Integer, Lecturer>();
    }

    public Map<Integer, Lecturer> getAllLecturers() {
        return lecturerList;
    }

    public Lecturer getLecturerByID(Integer id) {
        return lecturerList.get(id);
    }

    public void insertLecturer(Integer id, Lecturer lecturer) {
        lecturerList.put(id, lecturer);
    }

    public void deleteLecturer(Integer id) {
        lecturerList.remove(id);
    }

}