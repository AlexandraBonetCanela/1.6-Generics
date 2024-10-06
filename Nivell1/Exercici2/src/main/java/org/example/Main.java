package org.example;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Ariadna", "Gil", 24);
        GenericMethods gm = new GenericMethods();

        gm.print(person1, "BlackFriday", 13);
        gm.print("BlackFriday", 13, person1);
    }
}