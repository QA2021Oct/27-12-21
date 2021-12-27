package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {

    //1. create Unchecked exception (create a new class called UnCeException that extends RunTimeException )
    // and throw this new UnCeException from main.
    //**Etgar - take care that exception

    //2. create checked exception (create a new class called CeException that extends Exception )
    //and throw this new CeException from main.
    //**Etgar - take care that exception

    public static void main(String[] args) {

        //1:
        try {
            throw new UnCeException("just like that");
        }
        catch (UnCeException o){
            System.out.println(o.getMessage());
        }

        //2:
        try {
            throw new CeException("just like that 2");
        }
        catch (CeException o){
            System.out.println(o.getMessage());
        }
    }

}
