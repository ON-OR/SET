package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets input number of cars: ");
        int carNumber = scanner.nextInt();//Inputting number of cars.
        Car[] arr = new Car[carNumber];//Creating an array of class Car objects.
        System.out.println("Input car information,\nCompany name, color & price:");
        for (int i = 0; i < carNumber; i++) {
            arr[i] = new Car();
            System.out.println((i + 1) + " car:");
            arr[i].input();//Adding car information.
        }
        System.out.println("Here is a list of " + arr.length + " Cars:");//Outputting all cars from array.
        for (int i = 0; i < carNumber; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("For which car you want to change price ?");//Changing car price
        int indexPrice = scanner.nextInt();
        System.out.println("How do you want to change price ?\n1- by %?\n2- by replacing old price by new?");
        int option = scanner.nextInt();
        if (option == 1) {//If change by percent.
            arr[indexPrice - 1].changePriceByPercent();
        } else {//If change by replacing an old price.
            arr[indexPrice - 1].changePrice();
        }
        for (int i = 0; i < carNumber; i++) {//Outputting new array with changed info.
            arr[i].print();
            String check = arr[i].getColor();
            if (check == "white") {
                System.out.println((i + 1) + " car must be repaired!");
            }
        }
    }
}
