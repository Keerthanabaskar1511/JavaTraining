package com.wipro.client;


import com.wipro.model.Employee;
import com.wipro.service.*;

public class EmployeeClient {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeServiceImpl();

        service.addEmployee(new Employee(1, "Anil", 30000));
        service.addEmployee(new Employee(2, "Ravi", 40000));

        System.out.println("All Employees:");
        service.getAllEmployees().forEach(System.out::println);

        try {
            service.updateEmployee(1, "Anil Kumar", 35000);
            System.out.println("\nAfter Update:");
            System.out.println(service.getEmployee(1));

            service.deleteEmployee(2);
            System.out.println("\nAfter Delete:");
            service.getAllEmployees().forEach(System.out::println);

            service.getEmployee(5); // Exception case

        } catch (EmployeeNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
