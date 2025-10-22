package com.pluralsight;

public class Room {
    private int numberOfBed;
    private boolean occupied;
    private boolean dirty;
    private double price;

    public Room(int numberOfBed, double price) {
        this.numberOfBed = numberOfBed;
        this.occupied = occupied;
        this.dirty = dirty;
        this.price = price;
    }

    public void checkIn() {
        dirty = true;
        occupied = true;
    }


    public void checkOut() {
        dirty = true;
        occupied = false;
    }


    public void cleanRoom() {
        dirty = false;
        occupied = false;
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
