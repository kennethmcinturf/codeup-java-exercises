public class Grocery_Item {
    private String name;
    private String catagory;
    private int quantity;

    public Grocery_Item(String name, String catagory, int quantity){
        this.name = name;
        this.catagory = catagory;
        this.quantity = quantity;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
