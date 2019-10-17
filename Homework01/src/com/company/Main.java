package com.company;

import java.util.Scanner;

public class Main {

    public void sortArray(float[] x)//Sorting elements from lower to higher
    {
        for(int i=1; i<x.length; i++)
        {
            float temp=0f;
            if(x[i-1] > x[i])
            {
                temp = x[i-1];
                x[i-1] = x[i];
                x[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
    //Task a):
        Scanner FLOAT = new Scanner(System.in);
        Scanner INT = new Scanner(System.in);
        Scanner DOUBLE = new Scanner(System.in);
        Scanner STRING = new Scanner(System.in);
        System.out.println("Input range for checking:\n");
        float leftrange = FLOAT.nextFloat();//left range
        float rightrange = FLOAT.nextFloat();//right range
        System.out.println("Range ["+leftrange+","+rightrange+"]\n");//output range
        System.out.println("Input three (Float) nombers,\nfor checking if they belongs to Range ");
        float firstforcheck = FLOAT.nextFloat();
        float secondforcheck = FLOAT.nextFloat();
        float thirdforcheck = FLOAT.nextFloat();
        Main m = new Main();
        float [] array = {firstforcheck, secondforcheck, thirdforcheck};
        m.sortArray(array);//Sorting array elements
        if (array[0] >= leftrange && array[0] <= rightrange)//If first element of sorted array belongs to array:
        {
            if (array[1] >= leftrange && array[1] <= rightrange)//If second element of sorted array belongs to array:
            {
                if (array[2] >= leftrange && array[2] <= rightrange)//If third element of sorted array belongs to array:
                {
                    System.out.println("All the nombers belongs to Range");
                    System.out.println("["+leftrange+","+array[0]+","+array[1]+","+array[2]+","+rightrange+"]");
                }
                else//If first & second element of sorted array belongs to array but third not:
                {
                    System.out.println("["+leftrange+","+array[0]+","+array[1]+","+rightrange+"]");
                }
            }
            else//If first element of sorted array belongs to array but second not:
            {
                if (array[2] >= leftrange && array[2] <= rightrange)//If first & third element of sorted array belongs to array but second not:
                {
                    System.out.println("["+leftrange+","+array[0]+","+array[2]+","+rightrange+"]");
                }
                else//If only first element of sorted array belongs to array:
                {
                    System.out.println("["+leftrange+","+array[0]+","+rightrange+"]");
                }
            }
        }
        else//If first element of sorted array do not belongs to array:
        {
            if (array[1] >= leftrange && array[1] <= rightrange)//If second element of sorted array belongs to array:
            {
                if (array[2] >= leftrange && array[2] <= rightrange)//If second & third element of sorted array belongs to array:
                {
                    System.out.println("["+leftrange+","+array[1]+","+array[2]+","+rightrange+"]");
                }
                else//If only second element of sorted array belongs to array:
                {
                    System.out.println("["+leftrange+","+array[1]+","+rightrange+"]");
                }
            }
            else//If none of the elements of sorted array belongs to array:
            {
                System.out.println("None of the elements belongs to Range.");
            }
        }
        //Task b):
        System.out.println("Input thre inegers for sorting:\n");//Serching max & min.
        int firstforsort = INT.nextInt();
        int secondforsort = INT.nextInt();
        int thirdforsort = INT.nextInt();
        float [] arr = {firstforsort, secondforsort, thirdforsort};
        m.sortArray(arr);
        System.out.println("Minimal element:" + arr[0]);
        System.out.println("Maximal element:" + arr[2]);
    }
}
