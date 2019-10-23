package com.company;

public class Square implements Shape {
    String name;
    double side;

    Square() {
        //Initializing default constructor.
    }

    Square(String n, double s) {
        //Initializing parameterized constructor.
        name = n;
        side = s;
    }

    public void input() {
        //Input method.
        name = "Sqare";                     //Inputting information
        side = scanner.nextDouble();        //about shape.
    }

    public void print() {
        //Print method.
        System.out.println("This is " + name + ", which side is " + side + ", which area is " + area() + ", which perimeter is " + perimeter() + ".");
    }

    @Override
    public void getName() {

    }

    @Override
    public void setName() {

    }

    public double area() {
        //Search area method.
        return side * side;
    }

    public double perimeter() {
        //Search perimeter method.
        return side * 4;
    }
}
