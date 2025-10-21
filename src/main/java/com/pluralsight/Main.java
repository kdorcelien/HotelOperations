package com.pluralsight;

public class Main {
public static void main(String[] args){
Room room1 = new Room(3,139.00,false,true);
    System.out.println("            Room 1 test");
System.out.println("Is this Room available? " + room1.isAvailable());
    System.out.println();

    Room room2 = new Room(1, 124.00, false, false);
    System.out.println("            Room 2 test");
    System.out.println("Is this Room available? " + room2.isAvailable());
    System.out.println();

    Reservation res = new Reservation("king", 3, true);
    System.out.println("            Reservation test ");
    System.out.println("Price per night: $" + res.getPrice());
    System.out.printf("Total: $%.2f" , res.getReservationTotal());
    System.out.println();

    Employee emp = new Employee(101, "Mark Twain", "Author", 20.0, 45.0);
    System.out.println("\n           Employee Test ");
    System.out.println("Regular hours: " + emp.getRegularHours());
    System.out.println("Overtime hours: " + emp.getOvertimeHours());
    System.out.println("Total pay: $" + emp.getTotalPay());
}
}
