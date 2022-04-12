package com.company.models;

//Node class
public class TravellerNode {

    //Node attributes
    private Traveller data;
    private TravellerNode previous;
    private TravellerNode next;

    //Primary Constructor
    public TravellerNode(Traveller data) {
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    //Default Constructor
    public TravellerNode() {
        this.data = null;
        this.previous = null;
        this.next = null;
    }

    public Traveller getData() {
        return data;
    }

    public void setData(Traveller data) {
        this.data = data;
    }

    public TravellerNode getPrevious() {
        return previous;
    }

    public void setPrevious(TravellerNode previous) {
        this.previous = previous;
    }

    public TravellerNode getNext() {
        return next;
    }

    public void setNext(TravellerNode next) {
        this.next = next;
    }
}
