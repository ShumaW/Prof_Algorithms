package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompanyEmployeeMap companyEmployeeMap = new CompanyEmployeeMap();

        companyEmployeeMap.addEmployee("CompanyA", new Employee(1, "John"));
        companyEmployeeMap.addEmployee("CompanyA", new Employee(2, "Alice"));
        companyEmployeeMap.addEmployee("CompanyB", new Employee(3, "Bob"));
        companyEmployeeMap.addEmployee("CompanyC", new Employee(4, "Charlie"));

        List<Employee> companyAEmployees = companyEmployeeMap.getEmployeesByCompany("CompanyA");
        System.out.println("Сотрудники компании CompanyA:");
        for (Employee employee : companyAEmployees) {
            System.out.println(employee);
        }

        Employee foundEmployee = companyEmployeeMap.getEmployeeById("CompanyB", 3);
        if (foundEmployee != null) {
            System.out.println("Найден сотрудник: " + foundEmployee);
        } else {
            System.out.println("Сотрудник с ID 3 не найден в компании CompanyB.");
        }
    }
}