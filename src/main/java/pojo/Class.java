package pojo;

public class Class {

    private String className;
    private Lecturer lecturer;

    public Class() {
    }

    public Class(String className, Lecturer lecturer) {
        this.className = className;
        this.lecturer = lecturer;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

}