package dao;

import pojo.Class;

import java.util.Map;

public interface ClassDAO {

    Map<Integer,Class> getAllClasses();
    Class getClassByID(Integer id);
    void insertClass(Integer id, Class classEntity);
    void deleteClass(Integer id);

}