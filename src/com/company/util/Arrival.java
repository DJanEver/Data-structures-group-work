package com.company.util;

import com.company.models.Traveller;
import com.company.models.TravellerNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Doubly linked list class
public class Arrival {
    //attributes
    private TravellerNode head;
    private TravellerNode tail;
    private int listSize;

    //Primary constructor
    public Arrival(TravellerNode head, TravellerNode tail, int listSize) {
        this.head = head;
        this.tail = tail;
        this.listSize = listSize;
    }

    //Default constructor
    public Arrival() {
        this.head = null;
        this.tail = null;

        this.listSize = 0;
    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public TravellerNode getHead() {
        return head;
    }

    public void setHead(TravellerNode head) {
        this.head = head;
    }

    public TravellerNode getTail() {
        return tail;
    }

    public void setTail(TravellerNode tail) {
        this.tail = tail;
    }

    //creates doubly linked list
    public TravellerNode createList(List<Traveller> tZero, List<Traveller> tOne, List<Traveller> tTwo){
        List<Traveller> mainList = new ArrayList<>();
        mainList.addAll(tZero);
        mainList.addAll(tOne);
        mainList.addAll(tTwo);

        //for each was used to add each node to the doubly linked list
        mainList.forEach((traveller) -> {
            TravellerNode newNode = new TravellerNode(traveller);

            //check if lis is empty
            if(head==null){
                head = tail = newNode;
                head.setPrevious(null);
                tail.setNext(null);
            }else{
                tail.setNext(newNode);
                newNode.setPrevious(tail);
                tail = newNode;
                tail.setNext(null);
            }
        });
        return head;
    }

    //Loops through list to display each node
    public Boolean displayNodes(TravellerNode head){
        TravellerNode current = head;
        if(current == null){
            System.out.println("List is empty");
            return false;
        }else{
            while(current != null){
                System.out.println(current.getData() + " ");
                current = current.getNext();
            }
        }
        return true;
    }

    //Deletes each node from the list
    public TravellerNode removeFromList(TravellerNode head){
        int count = 0;
        Random ran = new Random();
        int newRan = 0;
        int loop = 1;

        do{
            newRan = ran.nextInt(3) + 3;
            if(listSize < newRan){
               newRan = listSize;
            }else if(listSize > newRan){
                listSize = listSize - newRan;
            }
            count = 0;

        while (count < newRan) {
            if (head == null) {
                System.out.println("List is empty");

            } else {
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("Current List Status on loop: " + loop);
                displayNodes(head);
                head = head.getNext();
                if (head != null) {
                    head.setPrevious(null);
                }
            }
            loop++;
            count++;
        }
    }while (head != null);
        return null;
    }

    //creates the report level 1 male and female
    public Boolean displayNumLOneMandF(TravellerNode head){
        int numF = 0;
        int numM = 0;

        if(head == null){
            System.out.println("List is empty");
            return false;
        }else{
            while(head != null){
               if(head.getData().getGender().equals("Male") &&
                       head.getData().getPriorityNum() == 1)
               {
                   numM++;
               }else if(head.getData().getGender().equals("Female") &&
                       head.getData().getPriorityNum() == 1){
                   numF++;

               }
                head = head.getNext();
            }
        }
        System.out.println("Number of Level one Male: " + numM);
        System.out.println("Number of Level one Females: " + numF);

        return true;
    }

    //creates the report level 2 male and female
    public Boolean displayNumLTwoMandF(TravellerNode head){
        int numFT = 0;
        int numMT = 0;

        if(head == null){
            System.out.println("List is empty");
            return false;
        }else{
            while(head != null){
                if(head.getData().getGender().equals("Male") &&
                        head.getData().getPriorityNum() == 2)
                {
                    numMT++;
                }else if(head.getData().getGender().equals("Female") &&
                        head.getData().getPriorityNum() == 2){
                    numFT++;

                }
                head = head.getNext();
            }
        }
        System.out.println("Number of Level Two Male: " + numMT);
        System.out.println("Number of Level Two Females: " + numFT);

        return true;
    }
}
