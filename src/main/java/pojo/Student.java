package pojo;

public class Student {

    private String studentName;
    private Class className;

    public Student() {
    }

    public Student(String studentName, Class className) {
        this.studentName = studentName;
        this.className = className;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Class getClassName() {
        return className;
    }

    public void setClassName(Class className) {
        this.className = className;
    }

}