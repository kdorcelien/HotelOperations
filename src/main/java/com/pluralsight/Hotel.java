package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;
    private boolean bookRoom;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            // Trying to book suites
            int available = getAvailableSuites();
            if (numberOfRooms <= available) {
                bookedSuites += numberOfRooms;
                System.out.println("Booked " + numberOfRooms + " suite(s)!");
                return true;
            } else {
                System.out.println("Not enough suites available!");
                return false;
            }
        } else {
            // Trying to book basic rooms
            int available = getAvailableRooms();
            if (numberOfRooms <= available) {
                bookedBasicRooms += numberOfRooms;
                System.out.println("Booked " + numberOfRooms + " basic room(s)!");
                return true;
            } else {
                System.out.println("Not enough basic rooms available!");
                return false;
            }
        }
    }
public int getAvailableSuites(){
        if(numberOfSuites != 0){
            System.out.printf("available: %d-%d" + getNumberOfSuites(),getBookedSuites() );
        }else {
            System.out.println("No suites available");
        }

    return getNumberOfSuites()-getBookedSuites();
}
    public int getAvailableRooms(){
        if(numberOfRooms != 0){
            System.out.printf("available: %d-%d" + getNumberOfRooms(),getBookedBasicRooms());
        }else {
            System.out.println("No rooms available");
        }
        return getNumberOfRooms()-getBookedBasicRooms();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
