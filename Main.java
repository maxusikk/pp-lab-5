import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;

public class Main {
    public static <InvalidAgeException> void main(String[] args) {
        try {
            Person person = new Person("Mia Khalifa", 31);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            Messenger emailMessenger = new EmailMessenger();
            emailMessenger.sendMessage("Hello Mia, thank you for the most enjoyable experience yesterday");
        } catch (InvalidAgeException e) {
            System.err.println(e.getMessage());
        }
    }
}