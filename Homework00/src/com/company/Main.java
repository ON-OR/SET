package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Name input.
        Scanner STRING = new Scanner(System.in);
        System.out.println("Hello what is your Name?");
        String Name = STRING.nextLine();
        //Mood question.
        System.out.println("How are you?");
        String Mood = STRING.nextLine();
        System.out.println("Hey " + Name + ", you are " + Mood + "!");
        //Calculator.
	    System.out.println("Hello World! This program is created to calculate `double` nombers.");
        Scanner DOUBLE = new Scanner(System.in);
        System.out.println("Enter first item:");
        double A = DOUBLE.nextDouble();
            System.out.println("Enter second item:");
            double B = DOUBLE.nextDouble();
                Scanner operator = new Scanner(System.in);
                System.out.println("Chose operation(1-'+',2-'-',3-'*',4-'/'):");
                int Oper = operator.nextInt();
            if(Oper == 1)
                {
                    double C = A + B;
                    System.out.println("Result" + C);
                }
                else if(Oper == 2)
                {
                    double C = A - B;
                    System.out.println("Result" + C);
                }
                else if(Oper == 3)
                {
                    double C = A * B;
                    System.out.println("Result" + C);
                }
                else if(Oper == 4)
                {
                    double C = A / B;
                    System.out.println("Result: " + C);
                }
        //Char task.
        Scanner CHAR = new Scanner(System.in);
        System.out.println("Enter three Chars:");
        String Fchar = CHAR.nextLine();
        String Schar = CHAR.nextLine();
        String Tchar = CHAR.nextLine();
        int FcharLeng = Fchar.length();
        int ScharLeng = Schar.length();
        int TcharLeng = Tchar.length();
        if (FcharLeng != 1 || ScharLeng !=1 || TcharLeng !=1 )
        {
            System.out.println("You entered a String, not a Char");
        }
        System.out.println("You enter " + Fchar + ",\n" + Schar + ", " + Tchar);
        //Integers task
        Scanner INT = new Scanner(System.in);
        System.out.println("Input two integers:\n");
        int Fint = INT.nextInt();
        int Sint = INT.nextInt();
        boolean isPosetive;
        if (Fint >=0  && Sint >=0 )
        {
            isPosetive = true;
        }
        else
            {
                isPosetive = false;
            }
        if (isPosetive = true)
        {
            System.out.println("First & Second char are both positive");
        }
        else if (isPosetive = false)
        {
            System.out.println("First & Second char are not both positive");
        }
    }
}
