/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepractice.domain;

/**
 *
 * @author almas
 */
public class Employee {
    
    private int empId ;
    private String name;
    private String ssn;
    private double salary;  
    public Employee(int id, String name, String ssn, double salary){
        this.empId = id;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;   
    }
    public void setName(String name){
        if (name.equals("")){
            System.out.println("Wrong name");
        }
        this.name = name;
    }
            
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double raise){
        if(raise <= 0){
            System.out.println("Wrong raise value");
        }
        this.salary+=raise;
    } 
}

 