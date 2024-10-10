package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ariadna", "Gil", 24);
        GenericMethods gm = new GenericMethods();

        gm.print(1, person1, "Gotta Work", 354);
        gm.print(2,"HEllO");
    }
}