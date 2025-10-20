package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name, department;
    private double payRate, hoursWorked, regularHours, overtimeHours;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, double regularHours, double overtimeHours) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

public double getTotalPay(){
        return hoursWorked * payRate;
}
    public double getHoursWorked() {
        return regularHours + overtimeHours;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public void setRegularHours(double regularHours) {
        this.regularHours = regularHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }


    @Override
    public String toString() {
        return "employeeId:" + employeeId +
                "| name: " + name +
                "| department: " + department +
                "| payRate: " + payRate +
                "| hoursWorked: " + hoursWorked +
                "| regularHours: " + regularHours +
                "| overtimeHours: " + overtimeHours;
    }
}
