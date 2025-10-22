package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;


    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;


    }
    public void punchIn(double time) {
        this.startTime = time;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        this.startTime = now.getHour() + (now.getMinute() / 60);
    }

    public void punchOut(double time) {
        this.hoursWorked += (time - this.startTime);
        this.startTime = -1;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + (now.getMinute() / 60);
        this.hoursWorked += (time - this.startTime);
        this.startTime = -1;
    }

    public void punchTimeCard(double time) {
        if (startTime == 0) {
            startTime = time;
        } else {
            double hoursToday = time - startTime;
            hoursWorked += hoursToday;
            startTime = 0;
        }
    }

    public void punchTimeCard() {
        if (startTime == 0) {
            LocalDateTime now = LocalDateTime.now();
            double currentTime = now.getHour() + (now.getMinute() / 60.0);
            startTime = currentTime;
        } else {
            LocalDateTime now = LocalDateTime.now();
            double currentTime = now.getHour() + (now.getMinute() / 60.0);
            double hoursToday = currentTime - startTime;
            hoursWorked += hoursToday;
        }
    }




    public double getRegularHours() {
        if (hoursWorked <= 40) {
            return hoursWorked;
        } else {
            return 40;
        }
    }


    public double getOvertimeHours() {
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    public double getTotalPay() {
        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * (payRate * 1.5);
        return regularPay + overtimePay;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}