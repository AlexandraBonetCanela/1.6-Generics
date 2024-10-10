package org.example;

public class Main {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone();
        Generic generic = new Generic();

        generic.useTelephone(smartphone);
        generic.useSmartphone(smartphone);
    }
}