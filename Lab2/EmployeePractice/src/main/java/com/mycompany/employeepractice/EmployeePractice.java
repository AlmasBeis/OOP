/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeepractice;

import com.mycompany.employeepractice.domain.Employee;

/**
 *
 * @author almas
 */
public class EmployeePractice {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setName("Jane Smith");
        emp.setSsn("012-34-5678");
        emp.setSalary(120_345.27);
       
        System.out.println("Employee Id: "+ emp.getEmpId());
        System.out.println("Employee Name: "+ emp.getName());
        System.out.println("Employee Ssn: "+ emp.getSsn());
        System.out.println("Employee Salary: "+ emp.getSalary());
    }
}
