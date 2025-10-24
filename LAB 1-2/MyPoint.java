package com.mycompany.mypoint;

public class MyPoint {
private double x;
private double y;
// No-arg constructor
public MyPoint() {
this.x = 0;
this.y = 0;
}
// Constructor with parameters
public MyPoint(double x, double y) {
this.x = x;
this.y = y;
}
// Getters
public double getX() {
return x;
}
public double getY() {
return y;
}
// Distance methods
public double distance(MyPoint anotherPoint) {
double dx = this.x - anotherPoint.x;
double dy = this.y - anotherPoint.y;
return Math.sqrt(dx * dx + dy * dy);
}
public double distance(double x, double y) {
double dx = this.x - x;
double dy = this.y - y;
return Math.sqrt(dx * dx + dy * dy);
}
public static double distance(MyPoint p1, MyPoint p2) {
double dx = p1.x - p2.x;
double dy = p1.y - p2.y;
return Math.sqrt(dx * dx + dy * dy);
}
// Test program
public static void main(String[] args) {
MyPoint p1 = new MyPoint(0, 0);
MyPoint p2 = new MyPoint(10, 30.5);
System.out.println("Distance between two points: " + p1.distance(p2));
}
}