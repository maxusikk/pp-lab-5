// Main.java

import company.beans.Person;
import company.exception.InvalidAgeException;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Damian", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}
