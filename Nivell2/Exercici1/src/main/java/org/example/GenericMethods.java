package org.example;

public class GenericMethods {
    @SafeVarargs
    public final <T>void print(int par1, T... parameters){
        System.out.println("(int): " + par1);
        for (T parameter : parameters) {
            System.out.println(parameter);
        }
    }
}
