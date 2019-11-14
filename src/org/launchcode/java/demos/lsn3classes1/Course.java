package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private HashMap classTimes = new HashMap<String, String>();
    private ArrayList<Student> students = new ArrayList<Student>();
    private Teacher teacher = new Teacher();
    String getCourseName() {
        return courseName;
    }
    HashMap getClassTimes() {
        return classTimes;
    }
    ArrayList getStudents() {
        return students;
    }
    Teacher getTeacher() {
        return teacher;
    }
    void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    void setClassTimes(String day, String time) {
        classTimes.put(day, time);
    }
    void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }
    void removeStudent(String studentName) {
        for (int i = 0; i < this.students.size(); i++) {
            if(this.students.get(i).getName().equals(studentName)) {
                this.students.remove(i);
                i--;
            }
        }
    }
}
