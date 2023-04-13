/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threadinterrupted;

/**
 *
 * @author almas
 */
public class Counter implements Runnable{
    @Override
    public void run(){
        int x = 0;
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("The current value of x is: " + x++);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                return;
            }
        }
    }
}
