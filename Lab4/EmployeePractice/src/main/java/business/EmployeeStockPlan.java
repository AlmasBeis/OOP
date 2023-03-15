/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

import com.mycompany.employeepractice.domain.Director;
import com.mycompany.employeepractice.domain.Employee;
import com.mycompany.employeepractice.domain.Manager;

/**
 *
 * @author almas
 */
public class EmployeeStockPlan {
    private final int employeeShares = 10;
    private final int managerShares = 100;
    private final int directorShares = 1000;
    public int grantStock(Employee emp){
        if(emp instanceof Director){
            return directorShares;
        } else if(emp instanceof Manager){
                   return managerShares;
               } else {
                return employeeShares;
              }
        
    }
}
