package com.company;
import java.awt.*;

class Employee {
    String scream = "hey, you, lazy potato, you  are fired!!!";
    public void sound()
        {
            System.out.println(scream);
            Toolkit.getDefaultToolkit().beep();
        }
    public void soundloud()
    {
        System.out.println(scream.toUpperCase());
        Toolkit.getDefaultToolkit().beep();
    }
}
