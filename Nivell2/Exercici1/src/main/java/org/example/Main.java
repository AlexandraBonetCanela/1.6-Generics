package org.example;

public class Main {
    public static void main(String[] args) {

        // Exercici 1 & Exercici 2
        Person person1 = new Person("Ariadna", "Gil", 24);
        GenericMethods gm = new GenericMethods();

        gm.print(13, person1, "BlackFriday", 13, "Pumking");
        gm.print(23,"BlackFriday", person1, 65, "Classy", "Contagious", "Sick");
    }
}