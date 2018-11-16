package products;

public class Item extends Product {
    protected int amountInStock;

    public Item(String description, int price, int dateWhenAvalible, int amountInStock) {
        super(description, price, dateWhenAvalible);
        this.amountInStock = amountInStock;
    }

    public void amoontInStock(int inventory){
        this.amountInStock = inventory;
    }

    public void orderingNewProduct(){
        System.out.println("Stocking Shelves...");
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public void productOrdered(){
        orderingNewProduct();
        System.out.println("Shelves Stocked!!");
    }
}
