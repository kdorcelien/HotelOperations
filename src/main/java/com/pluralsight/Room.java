package com.pluralsight;

public class Room {
    private int numberOfBed;
    private int price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBed, int price, boolean occupied, boolean dirty) {
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }


    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }
    public boolean isAvailable(){

        return !dirty && !occupied;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public int getPrice() {
        return price;
    }

}
