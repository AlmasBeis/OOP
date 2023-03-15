/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.example;

/**
 *
 * @author almas
 */
public enum DepositLength {
    THREE_MONTH (90), SIX_MONTH(180);
    
    private int days;
    
    private DepositLength(int days){
        this.days = days;
    }
    public int getDays(){
        return days;
    }
}
