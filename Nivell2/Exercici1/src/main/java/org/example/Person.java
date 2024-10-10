package org.example;

public class Person {
    private String name;
    private String surname;
    private int age;

    // TODO: Canviar no es a personsino a generic
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person: " + name + ", " + surname + ", " + age + " years old";
    }
}
