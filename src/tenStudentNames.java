import util.Input;

import java.util.HashSet;

public class tenStudentNames {
    public static void main(String[] args) {
        outputNames();
    }

    public static HashSet names = new HashSet();

    public static void generateNames(){
        Input input = new Input();
        int i = 0;
        do {
            String inputName = input.getString("Please enter a name");
            if (!names.contains(inputName.toLowerCase())){
                names.add(inputName);
            }
            i++;
        }while (i < 3);
    }

    public static void outputNames(){
        generateNames();
        System.out.println("The names in this list are:\n");
        for (Object name: names){
            System.out.println(name);
        }
    }
}
