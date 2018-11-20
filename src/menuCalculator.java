import util.Input;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

public class menuCalculator {
    public static void main(String[] args) {
        finalOrder();
    }
    public static void displayMenu(){
        System.out.println("1. Chicken Strips - $3.50");
        System.out.println("2. French Fries - $2.50");
        System.out.println("3. Hamburger - $4.00");
        System.out.println("4. Hotdog - $3.50");
        System.out.println("5. Large Drink - $1.75");
        System.out.println("6. Medium Drink - $1.50");
        System.out.println("7. Milk Shake - $2.25");
        System.out.println("8. Salad - $3.75");
        System.out.println("9. Small Drink - $1.25");
    }

    public static ArrayList<Integer> orderList = new ArrayList<>();
    public static ArrayList<Integer> chickenStrip = new ArrayList<>();
    public static ArrayList<Integer> frenchFries = new ArrayList<>();
    public static ArrayList<Integer> hamburger = new ArrayList<>();
    public static ArrayList<Integer> hotdog = new ArrayList<>();
    public static ArrayList<Integer> largeDrink = new ArrayList<>();
    public static ArrayList<Integer> mediumDrink = new ArrayList<>();
    public static ArrayList<Integer> milkShake = new ArrayList<>();
    public static ArrayList<Integer> salad = new ArrayList<>();
    public static ArrayList<Integer> smallDrink = new ArrayList<>();

    public static void generateOrderList(){
        Input input = new Input();
        Boolean continueOrdering = true;
        do {
            int orderItem = input.getInt("Please enter the item number of what you would like to order");
            input.getString();
            if (orderItem < 1 || orderItem > 10){
                System.out.println("Please enter a valid number");
                input.getString();
                generateOrderList();
            }
            orderList.add(orderItem);
            continueOrdering = input.yesNO("Continue Ordering?");
        }while (continueOrdering);
    }

    public static Double calculateTotal(ArrayList<Integer> orders){
        double total = 0;
        for (int i = 0; i < orders.size(); i++){
            if (orders.get(i) == 1){
                total = total + 3.50;
                chickenStrip.add(1);
            }else if (orders.get(i) == 2){
                total = total + 2.50;
                frenchFries.add(1);
            }else if (orders.get(i) == 3){
                total = total + 4.00;
                hamburger.add(1);
            }else if (orders.get(i) == 4){
                total = total + 3.50;
                hotdog.add(1);
            }else if (orders.get(i) == 5){
                total = total + 1.75;
                largeDrink.add(1);
            }else if (orders.get(i) == 6){
                total = total + 1.50;
                mediumDrink.add(1);
            }else if (orders.get(i) == 7){
                total = total + 2.25;
                milkShake.add(1);
            }else if (orders.get(i) == 8){
                total = total + 3.75;
                salad.add(1);
            }else if (orders.get(i) == 9) {
                total = total + 1.25;
                smallDrink.add(1);
            }
        }
        return total;
    }

    public static void finalOrder(){
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Welcome to the burger shack. Here's our menu");
        displayMenu();
        generateOrderList();
        System.out.println("Your total is: $" + formatter.format(calculateTotal(orderList)));
        if (chickenStrip.size() > 0){
            System.out.println("The total number of Chicken Strips is: " + chickenStrip.size() + " totaling $" + formatter.format(chickenStrip.size() * 3.50));
        }else if(frenchFries.size() > 0){
            System.out.println("The total number of French Fries is: " + frenchFries.size() + " totaling $" + formatter.format(frenchFries.size() * 2.50));
        }else if(hamburger.size() > 0){
            System.out.println("The total number of Hamburgers is: " + hamburger.size() + " totaling $" + formatter.format(hamburger.size() * 4));
        }else if(hotdog.size() > 0){
            System.out.println("The total number of Hotdogs is: " + hotdog.size() + " totaling $" + formatter.format(hotdog.size() * 3.50));
        }else if(largeDrink.size() > 0){
            System.out.println("The total number of Large Drinks is: " + largeDrink.size() + " totaling $" + formatter.format(largeDrink.size() * 1.75));
        }else if(mediumDrink.size() > 0){
            System.out.println("The total number of Medium Drinks is: " + mediumDrink.size() + " totaling $" + formatter.format(mediumDrink.size() * 1.50));
        }else if(milkShake.size() > 0){
            System.out.println("The total number of Milk Shakes is: " + milkShake.size() + " totaling $" + formatter.format(milkShake.size() * 2.25));
        }else if(salad.size() > 0){
            System.out.println("The total number of Salads is: " + salad.size() + " totaling $" + formatter.format(salad.size() * 3.75));
        }else if(smallDrink.size() > 0){
            System.out.println("The total number of Small Drinks is: " + smallDrink.size() + " totaling $" + formatter.format(smallDrink.size() * 1.25));
        }
        System.out.println("Thanks for coming to the burger shack!!");
    }
}
