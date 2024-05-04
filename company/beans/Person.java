// company/beans/Person.java

package company.beans;

import company.exception.InvalidAgeException;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        this.name = name;
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 125) {
            throw new InvalidAgeException("Invalid age: " + age);
        }
        this.age = age;
    }
}
