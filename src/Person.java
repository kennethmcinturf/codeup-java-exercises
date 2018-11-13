import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Person {
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.printf("%s says hello!", name);
    }

    public Person(String name){
        this.name = name;
    }

    public static void addPeople(Person[] people, Person person){
        Person[] peoples = new Person[people.length + 1];
        for (int i = 0; i < people.length; i++) {
            peoples[i] = new Person(people[i].getName());
        }
        peoples[people.length] = new Person(person.getName());
        for (Person dude: peoples) {
            System.out.println(dude.getName());
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please Enter the name");
        String newName = input.getString();
        Person person = new Person(newName);
    }
}
