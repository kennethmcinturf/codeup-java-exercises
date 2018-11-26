import util.Input;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroceryList {
    public static void main(String[] args) {
       init();
    }
    public static HashMap<String, Integer> groceryList = new HashMap<>();
    public static ArrayList<String> refigirated = new ArrayList<>();
    public static ArrayList<String> produce = new ArrayList<>();
    public static ArrayList<String> meat = new ArrayList<>();
    public static ArrayList<String> cannedGoods = new ArrayList<>();

    public static void printCatagories(){
        ArrayList<String> arrayOne = new ArrayList<>();
        System.out.println("Catagories\n");
        System.out.println("1. Refrigerated\n2.Produce\n3.Meat\n4.Canned Goods");
    }

    public static void addItems(ArrayList<String> catagory){
        Boolean continueShopping = true;
        do {
            Input input = new Input();
            String newItem = input.getString("Please enter item");
            int numberOfItem = input.getInt("Please enter the number of this item you want");
            for (int i = 1; i <= numberOfItem; i++){
                catagory.add(newItem);
            }
            continueShopping = input.yesNO("Continue Adding items to this catagory?");
        }while (continueShopping);
    }

    public static void generateList(){
        Input input = new Input();
        Boolean keepShopping = true;
        do {
            printCatagories();
            int catagory = input.getInt(1,4,"Please pick a catagory to add items to");
            if (catagory == 1){
                addItems(refigirated);
            }else if (catagory == 2){
                addItems(produce);
            }else if (catagory == 3){
                addItems(meat);
            }else if (catagory == 4){
                addItems(cannedGoods);
            }
            keepShopping = input.yesNO("Continue Adding Items?");
        }while (keepShopping);
    }

    static int indexOfAll(Object obj, ArrayList list){
        ArrayList<Integer> indexList = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++)
            if(obj.equals(list.get(i)))
                indexList.add(i);
        return indexList.size();
    }

    public static void addToHashMap (ArrayList<String> arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            groceryList.putIfAbsent(arrayList.get(i), indexOfAll(arrayList.get(i), arrayList));
        }
    }

    public static void generateHashMap(){
        addToHashMap(refigirated);
        addToHashMap(produce);
        addToHashMap(meat);
        addToHashMap(cannedGoods);
    }

    public static void makeList(){
        List keys = new ArrayList(groceryList.keySet());
        Collections.sort(keys);
        System.out.println("Here is your list organized:");
        for (int i = 0; i < keys.size(); i++){
            System.out.printf("%s: %d\n", keys.get(i), groceryList.get(keys.get(i)));
        }
    }

    public static void init(){
        generateList();
        generateHashMap();
        makeList();
    }
}
