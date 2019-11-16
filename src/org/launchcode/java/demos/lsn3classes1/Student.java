package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import java.text.DecimalFormat;

public class Student {
    private static DecimalFormat df1 = new DecimalFormat("0.0");
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }
    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }
    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    @Override
    public boolean equals(Object toCompare) {
        if (toCompare == this) {
            return true;
        } else if (toCompare == null) {
            return false;
        } else if (toCompare.getClass() != getClass()) {
            return false;
        }
        Student studentToCompare = (Student) toCompare;
        return studentToCompare.getStudentId() == getStudentId();
    }
    @Override
    public String toString() {
        return "Name=" + name + ",ID=" + studentId + ",Credits=" + numberOfCredits + ",Grade Level=" + getGradeLevel() + ",GPA=" + df1.format(gpa);
    }

    public String studentInfo() {
        return (name + " has a GPA of: " + df1.format(gpa));
    }
    public void addGrade(int courseCredits, double grade) {
        double qualityScore = gpa * numberOfCredits;
        qualityScore += grade * courseCredits;
        setNumberOfCredits(numberOfCredits + courseCredits);
        setGpa(qualityScore / numberOfCredits);
    }
    public String getGradeLevel() {
        if (numberOfCredits >= 90) {
            return "Senior";
        } else if (numberOfCredits >= 60) {
            return "Junior";
        } else if (numberOfCredits >= 30) {
            return "Sophomore";
        } else {
            return "Freshman";
        }
    }

    String getName() {
        return name;
    }
    int getStudentId() {
        return studentId;
    }
    int getNumberOfCredits() { return numberOfCredits; }
    double getGpa() {
        return gpa;
    }
    void setName(String name) {
        this.name = name;
    }
    void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
    void setGpa(double gpa) {
        this.gpa = gpa;
    }

}