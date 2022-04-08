package com.company;

import com.company.models.TravellerNode;
import com.company.util.Arrival;
import com.company.util.TravellerGenerator;

import java.util.Random;

public class Main {

    public static void main(String[] args){


        TravellerGenerator travellerGenerator = new TravellerGenerator();
        Arrival arrival = new Arrival();
        TravellerNode mainHead;

        //populate and sort t0, t1, t2 list
         travellerGenerator.populateTravelerLists();

         //setting list size
        arrival.setListSize(travellerGenerator.getListSize());

         //displaying all list
        System.out.println("List 0:");
        travellerGenerator.gettZeroList().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("List 1:");
        travellerGenerator.gettOneList().forEach(System.out::println);
        System.out.println(" ");
        System.out.println("List 2:");
        travellerGenerator.gettTwoList().forEach(System.out::println);

        mainHead = arrival.createList(travellerGenerator.gettZeroList(),
                travellerGenerator.gettOneList(), travellerGenerator
                        .gettTwoList());


        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Main List");
        arrival.displayNodes(mainHead);


        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Reports");
        arrival.displayNumLOneMandF(mainHead);
        arrival.displayNumLTwoMandF(mainHead);

        mainHead = arrival.removeFromList(mainHead);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        arrival.displayNodes(mainHead);

    }
}
