package com.company.util;

import com.company.models.Traveller;
import com.company.models.TravellerNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arrival {
    private TravellerNode head;
    private TravellerNode tail;
    private int listSize;

    public Arrival(TravellerNode head, TravellerNode tail, int listSize) {
        this.head = head;
        this.tail = tail;
        this.listSize = listSize;
    }

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

    public TravellerNode createList(List<Traveller> tZero, List<Traveller> tOne, List<Traveller> tTwo){
        List<Traveller> mainList = new ArrayList<>();
        int count = 0;
        mainList.addAll(tZero);
        mainList.addAll(tOne);
        mainList.addAll(tTwo);

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
}
