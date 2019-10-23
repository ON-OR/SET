package com.company;

public class Circle implements Shape {
    String name;
    double radius;


    Circle() {
        //Initializing default constructor.
    }

    Circle(String n, double r) {
        //Initializing parameterized constructor.
        name = n;
        radius = r;
    }

    public void input() {
        //Input method.
        name = "Circle";                    //Inputting information
        radius = scanner.nextDouble();      //about shape.
    }

    public void print() {
        //Print method.
        System.out.println("This is " + name + ", which radius is " + radius + ", which area is " + area() + ", which perimeter is " + perimeter() + ".");
    }

    @Override
    public void getName() {

    }

    @Override
    public void setName() {

    }

    public double area() {
        //Search area method.
        return radius * radius * Math.PI;
    }

    public double perimeter() {
        //Search perimeter method.
        return 2 * radius * Math.PI;
    }

}
