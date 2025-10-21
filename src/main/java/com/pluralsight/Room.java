package com.pluralsight;

public class Room {
    private int numberOfBed;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBed, double price, boolean occupied, boolean dirty) {
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public void checkIn() {
        dirty = true;
        occupied = true;
    }


    public void checkout() {
        occupied = false;
    }


    public void cleanroom() {
            dirty = false;
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

    public double getPrice() {
        return price;
    }

}
