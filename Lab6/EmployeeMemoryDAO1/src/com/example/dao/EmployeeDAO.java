/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.dao;
import com.example.model.Employee;
/**
 *
 * @author Ата
 */
public interface EmployeeDAO {
    public void add(Employee e);
    public void update(Employee e);
    public void delete(int id);
    public Employee findById(int id);
    public Employee[] getAllEmployees();
}
