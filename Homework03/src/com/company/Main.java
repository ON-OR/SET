package com.company;

interface SomethingIsWrong {//Interface method does not have a body.

    public void aMethod();
}

class MyClass implements SomethingIsWrong {//MyClass implements SomethingIsWrong.

    public void aMethod() {
        // The body of aMethod() is provided here:
        System.out.println("Hi Mom");
    }

}

public class Main {

    public static void main(String[] args) {

        //1. What is wrong with the following interface?
        //public interface SomethingIsWrong {
        //    void aMethod(int aValue){
        //        System.out.println("Hi Mom");
        //    }
        //}

        MyClass myObj = new MyClass();//Creating MyClass class object.
        myObj.aMethod();
    }
}
