package products;

public class Product {
    protected int price;
    protected String description;
    protected int dateWhenAvalible;

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

    public static void orderingNewProduct(){
        System.out.println("New Product inbound");
    }

    public void changeProductFeature(String feature){
        this.setDescription(feature);
    }
}
