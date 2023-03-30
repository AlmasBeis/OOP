/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

import com.example.model.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author almas
 */
public class EmployeeDAOMemoryImpl implements EmployeeDAO {
    public static Employee[] employeeArray = new Employee[10];
    @Override
    public void add(Employee e) {
        employeeArray[e.getId()] = e;
    }

    @Override
    public void update(Employee e) {
        employeeArray[e.getId()] = e;
    }

    @Override
    public void delete(int id) {
        employeeArray[id] = null;
    }

    @Override
    public Employee findById(int id) {
        return employeeArray[id];
    }

    @Override
    public Employee[] getAllEmployees() {
        List<Employee> emps = new ArrayList<>();
        for (Employee e : employeeArray) {
            if (e != null) {
                emps.add(e);
            }
        }
        return emps.toArray(new Employee[0]);
    }
    protected EmployeeDAOMemoryImpl(){
        
    }

}
