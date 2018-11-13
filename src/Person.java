import util.Input;

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
        sayHello();
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please Enter the name");
        String newName = input.getString();
        Person person = new Person(newName);
    }
}
