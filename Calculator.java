package com.challenge;

public class Calculator {
    //  The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
    private Floor floor;
    private Carpet carpet;

    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }


}
