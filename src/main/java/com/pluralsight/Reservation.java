package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType.trim();
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    
    public double getPrice() {
        double price = 0;

        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }

        if (isWeekend) {
            price = price * 1.1;
        }

        return price;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }

}
