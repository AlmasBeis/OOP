/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author almas
 */
public class PurchasingAgent {
    public PurchasingAgent(){
        System.out.println("Creating a purchasing Agent");
    }
    public void purchase(){
        Store store = Store.getInstance();
        Thread t = Thread.currentThread();
        System.out.println("Thread: " + t.getName()+ "," + t.getId());
        synchronized(store){
            if (store.getShirtCount() > 0 && store.authorizeCreditCard("1234", 15.00)){
                Shirt shirt = store.takeShirt();
                System.out.println("The shirt is our!");
                System.out.println(shirt);
            }else {
                System.out.println("No shirt for you");
            }
        }
    }
}
