package misc;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {

    private String name;
    List<Student> students = new ArrayList<>();

    public SchoolClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
