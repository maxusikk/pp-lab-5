import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Mia Khalifa", 31);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            int result = MathUtils.add(164, 12);
            System.out.println("Result: " + result);

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Hello, Mia! The math result you asked for is " + result + ".");
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}