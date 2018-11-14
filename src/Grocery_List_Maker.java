import util.Input;

public class Grocery_List_Maker {
    public static void main(String[] args) {
        buildGroceryList();
    }
    public static void buildGroceryList(){
        Input input = new Input();
        System.out.println("How many items do you need from the store?");
        int lengthOfList = input.getInt();
        input.getString();
        Grocery_Item[] grocerylist = new Grocery_Item[lengthOfList];
        for (int i = 0; i < lengthOfList; i++){
            String itemName = input.getString("What item do you need?");
            String itemCatagory = input.getString("What catagory is this item in?");
            int itemQuantity = input.getInt("And how many of that item do you need?");
            input.getString();
            grocerylist[i] = new Grocery_Item(itemName,itemCatagory,itemQuantity);
        }
        for (Grocery_Item item: grocerylist) {
            System.out.printf("Item Name:%s | Item Catagory:%s | Number of Item:%d%n", item.getName(), item.getCatagory(), item.getQuantity());
        }
    }
}
