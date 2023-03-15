/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeepractice;

import business.EmployeeStockPlan;
import com.mycompany.employeepractice.domain.Admin;
import com.mycompany.employeepractice.domain.Director;
import com.mycompany.employeepractice.domain.Employee;
import com.mycompany.employeepractice.domain.Engineer;
import com.mycompany.employeepractice.domain.Manager;

/**
 *
 * @author almas
 */
public class EmployeePractice {

    public static void main(String[] args) {
        Employee emp = new Employee(102,"Almas Beis", "012-01-3213", 200_000.03);
        Engineer eng = new Engineer(101,"Stone Smith","012-34-5678",120_345.67);
        Manager mng = new Manager(207, "Barbara Johnson", "054-12-2367",109_501.36,"US Marketing");
        Admin adm = new Admin(304,"Bill Monroe", "108-23-6509",75_002.34);
        Director drc = new  Director(12,"Sultan Wheeler", "099-45-2340",120_567.36,"Global Marketing",1_000_000.00);
        printEmployee(eng);
        printEmployee(mng);
        printEmployee(adm);
        printEmployee(drc);
        eng.raiseSalary(100_000.0);
        printEmployee(eng);
        EmployeeStockPlan esp = new EmployeeStockPlan();
        printEmployee(emp,esp);
        
    }
    public static void printEmployee(Employee emp){
            System.out.println();
            System.out.println("Employee type:  " + emp.getClass().getSimpleName());
            System.out.println(emp.toString());   
        }
    
    public static void printEmployee(Employee emp, EmployeeStockPlan esp){
        printEmployee(emp);
        System.out.println("Stock Options: " + esp.grantStock(emp));
    }
    
}

    
