package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Scanner s = new Scanner(System.in);
        // checked exception:

        //throws - we put in a function signature. usually - for taking care of checked exceptions:
        Thread.sleep(5000);

        //checked exception:
        try {
            FileReader fr = new FileReader("C:\\test\\a.text");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        // Unchecked exception:
        int a = 1;
        int b= 0;
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("mast go out");
        }
        System.out.println("..............");

        //throw:
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        checkNumber(num);
    }

    //throw new exception:
    // we use when we want to explicitly throw an exception:
    public static void checkNumber(int number){
        // we use the Unchecked exception:
        if(number < 1){
            throw new MyException("number is negative, cannot work with it");
        }
        // we use the checked exception:
        else {
            try {
                throw new MyCheckedException("number is positive");
            } catch (MyCheckedException e) {
                e.printStackTrace();
            }
        }

    }
}
