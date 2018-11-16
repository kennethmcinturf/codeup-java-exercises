package products;

public class Product {
    protected int price;
    protected String description;
    protected int dateWhenAvalible;

    public Product(String description, int price, int dateWhenAvalible) {
        this.description = description;
        this.price = price;
        this.dateWhenAvalible = dateWhenAvalible;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDateWhenAvalible() {
        return dateWhenAvalible;
    }

    public void setDateWhenAvalible(int dateWhenAvalible) {
        this.dateWhenAvalible = dateWhenAvalible;
    }

    public void orderingNewProduct(){
        System.out.println("New Product inbound");
    }

    public void changeProductFeature(String feature){
        this.setDescription(feature);
    }

    public void productOrdered(){
        orderingNewProduct();
        System.out.println("Product Here!!");
    }
}
