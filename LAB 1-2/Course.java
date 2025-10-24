package com.mycompany.course;

public class Course {
private final String courseName;
private String[] students = new String[100];
private int numberOfStudents;
public Course(String courseName) {
this.courseName = courseName;
}
public void addStudent(String student) {
if (numberOfStudents >= students.length) {
String[] temp = new String[students.length + 10];
System.arraycopy(students, 0, temp, 0, students.length);
students = temp;
}
students[numberOfStudents] = student;
numberOfStudents++;
}
public String[] getStudents() {
return students;
}
public int getNumberOfStudents() {
return numberOfStudents;
}
public String getCourseName() {
return courseName;
}
public void dropStudent(String student) {
for (int i = 0; i < numberOfStudents; i++) {
if (students[i].equals(student)) {
students[i] = students[numberOfStudents - 1];
students[numberOfStudents - 1] = null;
numberOfStudents--;
break;
}
}
}
public void clear() {
for (int i = 0; i < numberOfStudents; i++) {
students[i] = null;
}
numberOfStudents = 0;
}
// Test
public static void main(String[] args) {
Course course = new Course("Data Structure");
course.addStudent("Alice");
course.addStudent("Bob");
course.addStudent("Charlie");
System.out.println("Number of students: " + course.getNumberOfStudents());
course.dropStudent("Bob");
System.out.println("After dropping Bob, number of students: " +
course.getNumberOfStudents());
course.clear();
System.out.println("After clearing, number of students: " +
course.getNumberOfStudents());
}
}