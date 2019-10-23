package com.company;

import java.util.Scanner;

public class Main {
    // 4. Task
    // 1) Create Interface Shape add methods getName(), setName(), area() and perimeter(),
    //    which can return area and perimeter of shape;
    //    Create classes Circle, Square derived from Shape with field radius (for Circle)
    //    and side (for Square).   Add necessary constructors, properties to these classes,
    //    override methods from interface Shape.
    //    a) In Main() create list of Shape, then ask user to enter data of 10 different shapes.
    //    Write name, area and perimeter of all shapes.
    //    b) Find shape with the largest perimeter and print its name.
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of Circles:");
        int circlesNumber = scanner.nextInt();//Inputting number of circles.
        Circle[] firstArr = new Circle[circlesNumber];//Creating an array of class Circle objects.
        System.out.println("Input Circle radius:");
        for (int i = 0; i < circlesNumber; i++) {
            firstArr[i] = new Circle();
            System.out.println((i + 1) + " Circle:");
            firstArr[i].input();//Adding circles information.
        }
        double maxArea;
        for (int i = 0; i < circlesNumber; i++) {
            firstArr[i].print();//Outputting information.
        }
        int squaresNumber = scanner.nextInt();//Inputting number of squares.
        Square[] secondArr = new Square[squaresNumber];//Creating an array of class Square objects.
        System.out.println("Input Square side:");
        for (int i = 0; i < squaresNumber; i++) {
            secondArr[i] = new Square();
            System.out.println((i + 1) + " Square:");
            secondArr[i].input();//Adding square information.
        }
        for (int i = 0; i < squaresNumber; i++) {
            secondArr[i].print();//Outputting information.
        }
    }
}
