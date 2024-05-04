// Main.java

import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        int b = 10;

        try {
            people[0] = new Person("Mia Khalifa", 31);
            people[1] = new Person("Lana Rhoades", 27);
            people[2] = new Person("Riley Reid", 32);
            people[3] = new Person("Adriana Chechik", 33);
            people[4] = new Person("Dwayne Johnson", 52);

            Messenger emailMessenger = new EmailMessenger();

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                System.out.println("Name: " + person.getName());
                System.out.println("Age: " + person.getAge());
                System.out.println("Result: " + result);

                emailMessenger.sendMessage("Hello, " + person.getName() + "! The math result you asked for is " + result + ".");
            }
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}