package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class EmployeePayRollServiceTest {

    private static final Object FILE_IO = 0 ;

    @Test
    public void given3EmployeeWhenWrittenToFileShouldMatchEmployeeEntries(){
        EmployeePayRollData[] arrayOfEmployee = {
                new EmployeePayRollData(1,"sukumar", 25000),
                new EmployeePayRollData(2, "kota", 20000),
                new EmployeePayRollData(3, "su", 15000)
        };
        EmployeePayRollService employeePayRollService;
        employeePayRollService = new EmployeePayRollService(Arrays.asList(arrayOfEmployee));
        employeePayRollService.writeEmployeePayRollData(FILE_IO);
    }

}