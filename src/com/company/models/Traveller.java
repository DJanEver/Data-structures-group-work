package com.company.models;

import java.util.Random;

public class Traveller {
    private int ID;
    private String firstName;
    private String lastName;
    private String gender;
    private int flightNum;
    private int priorityNum;

    //Default Constructor
    public Traveller() {
        //6 num for id
        this.ID = 0;
        this.firstName = "";
        this.lastName = "";
        this.gender = "";
        //3 for flight num
        this.flightNum = 0;
        this.priorityNum = new Random().nextInt(2) + 1;
    }

//    int num = new Random().nextInt(2) +1;

    //Primary Constructor
    public Traveller(int iD, String firstName, String lastName,
                     String gender, int flightNum, int priorityNum) {

        this.ID = iD;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.flightNum = flightNum;
        this.priorityNum = priorityNum;
    }

    public int getID()
    {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public int getPriorityNum() {
        return priorityNum;
    }

    public void setPriorityNum(int priorityNum) {
        this.priorityNum = priorityNum;
    }

    @Override
    public String toString() {
        return "Traveller{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", flightNum=" + flightNum +
                ", priorityNum=" + priorityNum +
                '}';
    }
}
