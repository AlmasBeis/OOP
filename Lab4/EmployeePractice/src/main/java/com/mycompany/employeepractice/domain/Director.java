/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeepractice.domain;

/**
 *
 * @author almas
 */
public class Director extends Manager {
    
    private double budget;
    public Director(int id, String name, String ssn, double salary, String deptName, double budget) {
        super(id, name, ssn, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
    
}
