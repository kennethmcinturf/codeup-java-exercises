package util;

import java.util.Scanner;

public class Input {

    private Scanner sc;

    public Input(){
        this.sc = new Scanner(System.in);
    }

    public String getString(){
        return this.sc.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return this.sc.nextLine();
    }

    public Boolean yesNO(){
        return this.sc.nextLine().equals("yes");
    }

    public Boolean yesNO(String prompt){
        System.out.println(prompt);
        return this.sc.nextLine().equals("yes");
    }

    public Integer getInt(){
        return this.sc.nextInt();
    }

    public Integer getInt(String prompt){
        System.out.println(prompt);
        return this.sc.nextInt();
    }

    public Integer getInt(int min, int max){
        int number = this.sc.nextInt();
        if (number > max || number < min){
            System.out.println("Number not in range, please enter a new number.");
            getInt(min,max);
        }
        return number;
    }

    public Integer getInt(int min, int max, String prompt){
        System.out.println(prompt);
        int number = this.sc.nextInt();
        if (number > max || number < min){
            System.out.println("Number not in range, please enter a new number.");
            getInt(min,max,prompt);
        }
        return number;
    }

    public Double getDouble(){
        return this.sc.nextDouble();
    }

    public Double getDouble(String prompt){
        System.out.println(prompt);
        return this.sc.nextDouble();
    }

    public Double getDouble(int min, int max){
        double number = this.sc.nextDouble();
        if (number > max || number < min){
            System.out.println("Number not in range, please enter a new number.");
            getInt(min,max);
        }
        return number;
    }

    public Double getDouble(int min, int max, String prompt){
        System.out.println(prompt);
        double number = this.sc.nextDouble();
        if (number > max || number < min){
            System.out.println("Number not in range, please enter a new number.");
            getInt(min,max,prompt);
        }
        return number;
    }


}
