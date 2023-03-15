/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepractice.domain;

/**
 *
 * @author almas
 */
public class Manager extends Employee {
    private String deptName;    
    public Manager(int id, String name, String ssn, double salary, String deptName) {
        super(id, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
    @Override
    public String toString(){
        return super.toString()+ "\nDepartment: "+ getDeptName();
    }
    
}   
