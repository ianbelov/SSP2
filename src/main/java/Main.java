import dao.ClassDaoImpl;
import dao.LecturerDaoImpl;
import dao.StudentDaoImpl;
import pojo.Class;
import pojo.Lecturer;
import pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        StudentDaoImpl studentDao = new StudentDaoImpl();
        ClassDaoImpl classDao = new ClassDaoImpl();
        LecturerDaoImpl lecturerDao = new LecturerDaoImpl();

        //Create some lecturers
        lecturerDao.insertLecturer(1, new Lecturer("First Lecturer"));
        lecturerDao.insertLecturer(2, new Lecturer("Second Lecturer"));

        //Create some classes and give them lecturers
        classDao.insertClass(1,
                new Class("Object-oriented programming Class", lecturerDao.getLecturerByID(1)));
        classDao.insertClass(2,
                new Class("Database Class", lecturerDao.getLecturerByID(1)));
        classDao.insertClass(3,
                new Class("Web-development Class", lecturerDao.getLecturerByID(2)));

        //Create some student and give them classes
        studentDao.insertStudent(1, new Student("First student", classDao.getClassByID(1)));
        studentDao.insertStudent(2, new Student("Second student", classDao.getClassByID(1)));
        studentDao.insertStudent(3, new Student("Third student", classDao.getClassByID(2)));
        studentDao.insertStudent(4, new Student("Fourth student", classDao.getClassByID(2)));
        studentDao.insertStudent(5, new Student("Fifth student", classDao.getClassByID(3)));

        printTimetable(studentDao.getAllStudents(), classDao.getAllClasses(), lecturerDao.getAllLecturers());
    }

    private static void printTimetable(Map<Integer, Student> allStudents, Map<Integer, Class> allClasses, Map<Integer, Lecturer> allLecturers) {
        for (Map.Entry<Integer, Class> entry : allClasses.entrySet()) {

            String lecturerName = entry.getValue().getLecturer().getLecturerName();
            List<String> studentList = new ArrayList<String>();
            for (Map.Entry<Integer, Student> studentEntry : allStudents.entrySet()) {
                if (studentEntry.getValue().getClassName().getClassName().equals(entry.getValue().getClassName())) {
                    studentList.add(studentEntry.getValue().getStudentName());
                }
            }

            System.out.println("Class with name " + entry.getValue().getClassName() +
                    " given by " + lecturerName +
                    " and attended by " + studentList);
        }
    }
}