package com.company;
import java.awt.*;

class Employee {//Superclass 
    String scream = "hey, you, lazy potato, you  are fired!!!";
    public void sound()//Function to output text & sound `bip`
        {
            System.out.println(scream);
            Toolkit.getDefaultToolkit().beep();
        }
    public void soundloud()//Function to output CapsLk text & sound `bip`
    {
        System.out.println(scream.toUpperCase());
        Toolkit.getDefaultToolkit().beep();
    }
}
