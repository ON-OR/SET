package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Name input.
        Scanner scanner = new Scanner(System.in);//Creating class object.
        System.out.println("Hello what is your Name?");
        String name = scanner.nextLine();//Inputing string.
        //Mood question.
        System.out.println("How are you?");
        String mood = scanner.nextLine();//Inputing string.
        System.out.println("Hey " + name + ", you are " + mood + "!");//Outputing string with to inputed items.
        //Calculator.
	    System.out.println("This program is created to calculate nombers.");
        System.out.println("Enter first item:");//Inputing first element.
        double a = scanner.nextDouble();
            System.out.println("Enter second item:");//Inputing second element.
            double b = scanner.nextDouble();
                System.out.println("Chose operation(1:'+',2:'-',3:'*',4:'/'): ");//Choosing the operation to calculate.
                int oper = scanner.nextInt();
            if(oper == 1)//'+' addition
	    {
                    double c = a + b;
                    System.out.println("Result" + c);
                }
                else if(oper == 2)//'-' subtraction
                {
                    double c = a - b;
                    System.out.println("Result" + c);
                }
                else if(oper == 3)//'*' multiplication
                {
                    double c = a * b;
                    System.out.println("Result" + c);
                }
                else if(oper == 4)//'/' division
                {
                    double c = a / b;
                    System.out.println("Result: " + c);
                }
        //Char task.
        System.out.println("Enter three Chars:");
        String fchar = scanner.nextLine();//Entering
        String schar = scanner.nextLine();//three
        String tchar = scanner.nextLine();//chars.
        int fcharLeng = fchar.length();
        int scharLeng = schar.length();
        int tcharLeng = tchar.length();
        if (fcharLeng != 1 || scharLeng !=1 || tcharLeng !=1 )//Checking if inputed item is chars, not a string.
        {
            System.out.println("You entered a String, not a Char");
        }
        System.out.println("You enter " + fchar + ",\n" + schar + ", " + tchar);//Outputing chars.
        //Integers task
        System.out.println("Input two integers:\n");
        int fint = scanner.nextInt();//Inputing two
        int sint = scanner.nextInt();//integers.
        boolean isposetive;
        if (fint >=0  && sint >=0 )//Checking if they are bouth positive.
        {
            isposetive = true;
        }
        else if (fint <=0  && sint <=0 )
            {
                isposetive = false;
            }
	    else if (fint >=0  && sint <=0 )//Case first integeris positive, but Second int is not outputing next:
	    {
	    	 System.out.println("First int is positive but Second int is not.");
	    }
	    else if (fint <=0  && sint >=0 )//Case first integeris is not positive, but Second int is outputing next:
	    {
	    	 System.out.println("First int is not positive but Second int is.");
	    }
        if (isposetive = true)//Case integers are positive, outputing next:
        {
            System.out.println("First & Second int are both positive");
        }
        else if (isposetive = false)//Case integers are not, outputing next:
        {
            System.out.println("First & Second int are not both positive");
        }
    }
}
