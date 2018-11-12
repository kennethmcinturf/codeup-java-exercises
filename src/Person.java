import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a persons name.");
        String newPerson = scanner.nextLine();
        Person person = new Person();
        person.name = newPerson;
    }
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
}
