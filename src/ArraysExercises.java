import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] peoples = new Person[3];
        peoples[0] = new Person("KC");
        peoples[1] = new Person("Pebo");
        peoples [2] = new Person("Juan");
        Person newPerson = new Person("Marc");
        Person.addPeople(peoples,newPerson);
    }
}
