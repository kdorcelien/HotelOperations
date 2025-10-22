package com.pluralsight;

public class Main {
public static void main(String[] args){
Room room1 = new Room(3,false,false,139.00);
    System.out.println("            Room 1 test");
   // room1.checkIn();
   // room1.checkOut();
   // room1.cleanRoom();
System.out.println("Is this Room available? " + room1.isAvailable());

    System.out.println();

    Room room2 = new Room(1, false, false,124.00);
    System.out.println("            Room 2 test");
    room2.checkIn();
    room2.checkOut();
    room2.cleanRoom();
    System.out.println("Is this Room available? " + room2.isAvailable());
    System.out.println();


    Reservation res = new Reservation("king", 3, true);
    System.out.println("            Reservation test ");
    System.out.println("Price per night: $" + res.getPrice());
    System.out.printf("Total: $%.2f" , res.getReservationTotal());
    System.out.println();

    Employee emp = new Employee(101, "Mark Twain", "Author", 20.0, 45.0);
    System.out.println("\n           Employee Test ");
    emp.punchTimeCard(8.0);
    emp.punchTimeCard(17.0);
    System.out.println("Regular hours: " + emp.getRegularHours());
    System.out.println("Total hours: " + emp.getHoursWorked());
    System.out.println("Overtime hours: " + emp.getOvertimeHours());
    System.out.println("Total pay: $" + emp.getTotalPay());
    System.out.println();


    Hotel hotel = new Hotel("Grand Plaza", 10, 20);
    System.out.println("          Hotel test");
    System.out.println("Available suites: " + hotel.getAvailableSuites());
    System.out.println("Available rooms: " + hotel.getAvailableRooms());


    boolean reservation1 = hotel.bookRoom(3, true);
    System.out.println("Booking successful? " + reservation1 + ", Number of suite already booked: " + hotel.getBookedSuites());
    System.out.println("Current Available suites: " + hotel.getAvailableSuites());

    
    boolean reservation2 = hotel.bookRoom(10, true);
    System.out.println("Booking successful? " + reservation2 + ", Number of suite already booked: " + hotel.getBookedSuites());
    System.out.println("Current Available rooms: " + hotel.getAvailableSuites());


    boolean reservation3 = hotel.bookRoom(5, false);
    System.out.println("Booking successful? " + reservation3 + ", Number of room already booked: " + hotel.getBookedBasicRooms());
    System.out.println("Current Available rooms: " + hotel.getAvailableRooms());
}
}
