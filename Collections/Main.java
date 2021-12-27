package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Wrapper classes:
        int x = 9;
        Integer x1 = 4;

        float f = 3.6f;
        Float f1 = 4.8f;

        boolean b = true;
        Boolean b1 = false;

        // Collections:
        // Generics -  < >

        ArrayList<Cat> cats = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(9 );
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(10);

       // arrayList.forEach(System.out::println);
        System.out.println(arrayList);

        ArrayList<String> sArray = new ArrayList<>();
        sArray.add("Hey");
        sArray.add("How");
        sArray.add("are");
        sArray.add("you");
        sArray.add("Doing?");
        System.out.println("print using sout:");
        System.out.println(sArray);

        //using for loop:
        System.out.println("print using for:");
        for(int i = 0; i < sArray.size(); i++){
            System.out.println(sArray.get(i));
        }

        //Iterator:
        System.out.println("print using Iterator and wile loop:");
        Iterator<String> it = sArray.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
