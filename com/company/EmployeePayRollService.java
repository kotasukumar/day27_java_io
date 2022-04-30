package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeePayRollService {

    private List<employeePayRollData> employeePayRollList;

    public EmployeePayRollService(){}

    public EmployeePayRollService(ArrayList<employeePayRollData> employeePayRollList) {
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee roll pay program");
        ArrayList<employeePayRollData> employeePayRollList = new ArrayList<>();
        EmployeePayRollService employeePayRollService = new EmployeePayRollService(employeePayRollList);
        Scanner inputConsoleReader = new Scanner(System.in);
        employeePayRollService.readEmployeePayRollData(inputConsoleReader);
        employeePayRollService.writeEmployeePayRollData();
    }

    public void readEmployeePayRollData(Scanner inputConsoleReader){
        System.out.println("Enter id of the employee");
        int id = inputConsoleReader.nextInt();
        System.out.println("Enter name of the employee");
        String name = inputConsoleReader.next();
        System.out.println("Enter salary of the employee");
        double salary = inputConsoleReader.nextDouble();
        employeePayRollList.add(new employeePayRollData(id, name, salary));
    }

    public void writeEmployeePayRollData(){
        System.out.println("Writing employee payroll roster to console" + employeePayRollList);
    }
}
