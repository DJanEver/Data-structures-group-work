package com.company.util;

import com.company.models.Traveller;
import java.util.*;

public class TravellerGenerator {
    private List<Traveller> tZeroList;
    private List<Traveller> tOneList;
    private List<Traveller> tTwoList;
    private int listSize;
    public TravellerGenerator(List<Traveller> tZeroList,
                              List<Traveller> tOneList, List<Traveller> tTwoList, int listSize) {
        this.tZeroList = tZeroList;
        this.tOneList = tOneList;
        this.tTwoList = tTwoList;
        this.listSize = listSize;
    }

    public TravellerGenerator() {
        this.tOneList = new ArrayList<>();
        this.tTwoList = new ArrayList<>();
        this.tZeroList = new ArrayList<>();

    }

    public int getListSize() {
        return listSize;
    }

    public void setListSize(int listSize) {
        this.listSize = listSize;
    }

    public List<Traveller> gettZeroList() {
        return tZeroList;
    }

    public void settZeroList(List<Traveller> tZeroList) {
        this.tZeroList = tZeroList;
    }

    public List<Traveller> gettOneList() {
        return tOneList;
    }

    public void settOneList(List<Traveller> tOneList) {
        this.tOneList = tOneList;
    }

    public List<Traveller> gettTwoList() {
        return tTwoList;
    }

    public void settTwoList(List<Traveller> tTwoList) {
        this.tTwoList = tTwoList;
    }

    private static List<Integer> getIdList(){
        return new ArrayList<>(Arrays.asList(100000, 100001, 100003, 100004, 100005, 100006, 100007, 100008,
                100009,100010 , 100011, 100012, 100013, 100014, 100015, 100016, 100017, 100018));
    }

    private static List<String> getFirstnameList(){
        return new ArrayList<>(Arrays.asList("Hakeem", "Jim", "Willam", "Pam", "David", "Tori", "Gilpin", "Kendrick",
                "Kermait","Level" , "Ren", "Jimpusf", "Gehwn", "Wiam", "Dever", "Super", "Dooper", "Uper"));
    }


    private static List<String> getLastnameList(){
        return new ArrayList<>(Arrays.asList("Watson", "Jimcricket", "Defour", "Parish", "Walker", "Homes", "James", "Lamar",
                "swim","Hop" , "Run", "Skip", "Walk", "Babby", "Keem", "Kumar", "Roper", "Super"));
    }


    private static List<String> getGenderList(){
        return new ArrayList<>(Arrays.asList("Female", "Male"));
    }

    private static List<Integer> getFlightNumList(){
        return new ArrayList<>(Arrays.asList(100, 101, 103, 104, 105, 106, 107, 108,
                109,110 , 111, 112, 113, 114, 115, 116, 117, 118));
    }


    public void populateTravelerLists(){
        // Getting the list
        List<Integer> idList = getIdList();
        List<String> firstNameList = getFirstnameList();
        List<String> lastNameList = getLastnameList();
        List<String> genderList = getGenderList();
        List<Integer> flightNumList = getFlightNumList();
        Random ranNum = new Random();

        int maxID = 18;
        int maxFlightNim = 18;

        int tZeroCount = ranNum.nextInt(6) + 1;
        int tOneCount = ranNum.nextInt(6) + 1;
        int tTwoCount  = ranNum.nextInt(6) + 1;

        listSize = tZeroCount + tOneCount + tTwoCount;

        // creating t0 list
        for(int i=0; i<tZeroCount; i++){
            int ranID = idList.remove(ranNum.nextInt(maxID));
            String fName = firstNameList.get(ranNum.nextInt(18));
            String lName = lastNameList.get(ranNum.nextInt(18));
            String gender = genderList.get(ranNum.nextInt(2));
            int flightNum = flightNumList.remove(ranNum.nextInt(maxFlightNim));
            int pi =  ranNum.nextInt(2)+1;

            tZeroList.add(new Traveller(ranID, fName, lName, gender, flightNum, pi));
            maxID-=1;
            maxFlightNim-=1;
        }

        // creating t1 list
        for(int i=0; i<tOneCount; i++){
            int ranIDO = idList.remove(ranNum.nextInt(maxID));
            String fNameO = firstNameList.get(ranNum.nextInt(18));
            String lNameO = lastNameList.get(ranNum.nextInt(18));
            String genderO = genderList.get(ranNum.nextInt(2));
            int flightNumO = flightNumList.remove(ranNum.nextInt(maxFlightNim));
            int piO =  ranNum.nextInt(2)+1;

            tOneList.add(new Traveller(ranIDO, fNameO, lNameO, genderO, flightNumO, piO));
            maxID-=1;
            maxFlightNim-=1;
        }

        // creating t2 list
        for(int i=0; i<tTwoCount; i++){
            int ranIDT = idList.remove(ranNum.nextInt(maxID));
            String fNameT = firstNameList.get(ranNum.nextInt(18));
            String lNameT = lastNameList.get(ranNum.nextInt(18));
            String genderT = genderList.get(ranNum.nextInt(2));
            int flightNumT = flightNumList.remove(ranNum.nextInt(maxFlightNim));
            int piT =  ranNum.nextInt(2)+1;

            tTwoList.add(new Traveller(ranIDT, fNameT, lNameT, genderT, flightNumT, piT));
            maxID-=1;
            maxFlightNim-=1;
        }

     sortLists(tOneList, tZeroList, tTwoList);

    }


    public void sortLists(List<Traveller> listOne, List<Traveller> listZero, List<Traveller> listTwo){
        listOne.sort(new Comparator<Traveller>() {
            @Override
            public int compare(Traveller o1, Traveller o2) {
                return Integer.compare(o1.getPriorityNum(), o2.getPriorityNum());
            }
        });

        listZero.sort(new Comparator<Traveller>() {
            @Override
            public int compare(Traveller o1, Traveller o2) {
                return Integer.compare(o1.getPriorityNum(), o2.getPriorityNum());
            }
        });

        listTwo.sort(new Comparator<Traveller>() {
            @Override
            public int compare(Traveller o1, Traveller o2) {
                return Integer.compare(o1.getPriorityNum(), o2.getPriorityNum());
            }
        });

    }
}
