package com.company;

import java.util.Scanner;


public interface Shape {
    Scanner scanner = new Scanner(System.in);

    void getName();

    void setName();

    double area();

    double perimeter();
}
