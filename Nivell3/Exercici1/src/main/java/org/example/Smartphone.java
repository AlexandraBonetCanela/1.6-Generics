package org.example;

public class Smartphone implements Telephone{

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    public void takePhoto(){
        System.out.println("Taking photo...");
    }
}
