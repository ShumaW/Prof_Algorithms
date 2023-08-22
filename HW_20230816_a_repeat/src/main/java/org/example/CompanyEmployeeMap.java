package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompanyEmployeeMap {
    private final Map<String, List<Employee>> companyEmployeeMap;

    public CompanyEmployeeMap() {
        companyEmployeeMap = new HashMap<>();
    }

    public void addEmployee(String companyName, Employee employee) {
        companyEmployeeMap.computeIfAbsent(companyName, k -> new ArrayList<>()).add(employee);
    }

    public List<Employee> getEmployeesByCompany(String companyName) {
        return companyEmployeeMap.getOrDefault(companyName, new ArrayList<>());
    }

    public Employee getEmployeeById(String companyName, int id) {
        List<Employee> employees = companyEmployeeMap.getOrDefault(companyName, new ArrayList<>());
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }
}