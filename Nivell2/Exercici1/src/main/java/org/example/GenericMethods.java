package org.example;

public class GenericMethods {
    public <T,U,V>void print(T par1, U par2, int number){
        System.out.println("1: " + par1);
        System.out.println("2: " + par2);
        System.out.println("3: " + number);
    }
}
