package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;
    String getFirstName() { return this.firstName; }
    String getLastName() { return this.lastName; }
    String getSubject() { return this.subject; }
    int getYearsTeaching() { return this.yearsTeaching; }
    void setFirstName(String firstName) { this.firstName = firstName; }
    void setLastName(String lastName) { this.lastName = lastName; }
    void setSubject(String subject) { this.subject = subject; }
    void setYearsTeaching(int yearsTeaching) { this.yearsTeaching = yearsTeaching; }
}
