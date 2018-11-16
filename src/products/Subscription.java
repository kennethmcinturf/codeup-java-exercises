package products;

public class Subscription extends  Product{
    public Subscription(String description, int price, int dateWhenAvalible) {
        super(description, price, dateWhenAvalible);
    }

    public void orderingNewProduct(){
        System.out.println("Printing new stuff...");
    }

    public void productOrdered(){
        orderingNewProduct();
        System.out.println("Stuff Printed!!");
    }
}
