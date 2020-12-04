package dao;

import pojo.Class;

import java.util.HashMap;
import java.util.Map;

public class ClassDaoImpl implements ClassDAO {

    private Map<Integer, Class> classList;

    public ClassDaoImpl() {
        classList = new HashMap<Integer, Class>();
    }

    public Map<Integer, Class> getAllClasses() {
        return classList;
    }

    public Class getClassByID(Integer id) {
        return classList.get(id);
    }

    public void insertClass(Integer id, Class classEntity) {
        classList.put(id, classEntity);
    }

    public void deleteClass(Integer id) {
        classList.remove(id);
    }

}