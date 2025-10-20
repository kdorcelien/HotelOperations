package com.pluralsight;

public class Room {
    private int numberOfBed;
    private int price;
    private int roomNumber;

    public Room(int numberOfBed, int price, int roomNumber) {
        this.numberOfBed = numberOfBed;
        this.price = price;
        this.roomNumber = roomNumber;
    }

    public Room(int numberOfBed, int price) {
        this.numberOfBed = numberOfBed;
        this.price = price;
    }
public int isOccupied(){

    return  roomNumber;
}
    public int isDirty(){

        return roomNumber;
    }
    public boolean isAvailable(){

        return numberOfBed > 1;
    }

    public int getNumberOfBed() {
        return numberOfBed;
    }

    public void setNumberOfBed(int numberOfBed) {
        this.numberOfBed = numberOfBed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "numberOfBed:" + numberOfBed +
                "| price: " + price +
                "| roomNumber: " + roomNumber;
    }
}
