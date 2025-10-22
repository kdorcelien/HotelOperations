package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchin_should_make_emp_punchin() {
        Employee emp = new Employee(101, "Mark Twain", "Author", 20.0, 45.0);
boolean punchIn = true;
        emp.punchIn(8.0);
        emp.punchTimeCard(17.0);

        assertTrue(emp.getHoursWorked()> 45.0);
        assertFalse(emp.getOvertimeHours()> 45.0);
        assertSame(101, emp.getEmployeeId());

    }
}