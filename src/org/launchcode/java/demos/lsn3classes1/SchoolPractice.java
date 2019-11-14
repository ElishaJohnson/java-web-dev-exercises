package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        Student self = new Student();
        self.setName("Elisha Johnson");
        self.setStudentId(666);
        self.setGpa(4.0);
        self.setNumberOfCredits(1);
        Teacher professor = new Teacher();
        professor.setFirstName("Doctor");
        professor.setLastName("Jones");
        professor.setSubject("Ancient History");
        professor.setYearsTeaching(12);
        Course course = new Course();
        course.addStudent(self);
        course.setTeacher(professor);
        course.setClassTimes("Tuesday", "11:30am-1:30pm");
        course.setClassTimes("Friday", "11:30am-1:30pm");
        course.setCourseName("Archaeology 101");
        System.out.println("Course name: " + course.getCourseName());
        System.out.println("Professor: " + course.getTeacher().getFirstName() + " " + course.getTeacher().getLastName());
        System.out.println("Class times:");
        HashMap<String, String> classTimes = course.getClassTimes();
        for (Map.Entry<String, String> day : classTimes.entrySet()) {
            System.out.println(" " + day.getKey() + " " + day.getValue());
        }
        ArrayList<Student> allStudents = course.getStudents();
        Student topStudent = allStudents.get(0);
        System.out.println("Top Student: " + topStudent.getName());
    }
}
