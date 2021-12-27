package com.company;

public class Main {

    public static void main(String[] args) {
        int result =  returnFunction(3);
        System.out.println(result);
        notReturnFunction(3);
    }

    public static int returnFunction(int x){
        return x + 7;
    }

    public static void notReturnFunction(int x){
        System.out.println(x + 7);
    }

}
