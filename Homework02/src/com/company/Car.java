package com.company;

import java.util.Scanner;

public class Car {
    private String color;
    String companyName;
    double price;
    Scanner scanner = new Scanner(System.in);
    Car() {
        //Initializing default constructor.
    }

    Car(String col, String compNam, double pri) {
        //Initializing parameterized constructor.
        color = col;
        companyName = compNam;
        price = pri;
    }

    public String getColor() {//property for color field.
        return color;
    }

    public void input() {
        //Input method.
        companyName = scanner.nextLine();      //Inputting
        color = scanner.nextLine();            //information
        price = scanner.nextDouble();          //about car.
    }

    public void print() {
        //Print method.
        System.out.println("This " + color + " " + companyName + " which price is " + price + ".");
    }

    public String toString() {
        return color + " " + companyName + " " + price;
    }

    public void changePrice() {
        //Change price method.
        System.out.println("Input new Price");
        double newPrice = scanner.nextDouble();//Inputting new price.
        price = newPrice;
    }

    public void changePriceByPercent() {
        //Change price by percents method.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input percents: ");
        double percent = scanner.nextDouble();//Inputting percents.
        if (percent < 0) {
            price -= price * Math.abs(percent) / 100f;//If the price goes down.
        } else {
            price += price * percent / 100f;//If the price goes up.
        }

    }

}
