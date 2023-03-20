/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author almas
 */
public class Fish extends Animal implements Pet{
    private String name;
    @Override 
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    public Fish(){
        super(0);
    }
    @Override
    public void play(){
        System.out.println("Just keep swimming");
    }
    @Override 
    public void eat(){
        System.out.println("Fish eat pond scum");
    }
    @Override 
    public void walk(){
        super.walk();
        System.out.println("Fish of coure, can't walk; they swim.");
    }
    
}
