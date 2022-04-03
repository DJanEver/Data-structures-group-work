package com.company;

import com.company.util.TravellerGenerator;

public class Main {

    public static void main(String[] args) {


        TravellerGenerator travellerGenerator = new TravellerGenerator();

        //populate and sort t0, t1, t2 list
         travellerGenerator.populateTravelerLists();

         //displaying all list
        System.out.println("List 0:");
        travellerGenerator.gettZeroList().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("List 1:");
        travellerGenerator.gettOneList().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("List 2:");
        travellerGenerator.gettTwoList().forEach(System.out::println);
    }
}
