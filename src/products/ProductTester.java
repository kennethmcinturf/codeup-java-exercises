package products;

import Veichle.Car;

import java.lang.reflect.Type;
import java.util.Arrays;

public class ProductTester {
    public static void main(String[] args) {
        addProduct(product, createItem("Chair",14,12,40));
        addProduct(product, createSubscription("Cracked",40,9));
        addProduct(product, createService("Car Wash",10,8));
        addProduct(product, createService("Car Wash",10,8));
        for (Product thing: product) {
            System.out.println(thing.getPrice());
            System.out.println(thing.getDateWhenAvalible());
            System.out.println(thing.getDescription());
            thing.productOrdered();
            System.out.println(thing);
        }
    }

    static Product[] product;
    public static Item createItem(String productDis, int price, int dateAvalible, int amountInStock){
        Item newItem = new Item(productDis,price,dateAvalible,amountInStock);
        return newItem;
    }

    public static Subscription createSubscription(String productDis, int price, int dateAvalible){
        Subscription newSubscription = new Subscription(productDis,price,dateAvalible);
        return newSubscription;
    }

    public static Service createService(String productDis, int price, int dateAvalible){
        Service newService = new Service(productDis,price,dateAvalible);
        return newService;
    }

    public static void addProduct(Product[] products, String productDis, int price, int dateAvalible){
        if (products != null){
            Product[] productz = new Product[products.length + 1];
            Product productOne = new Product(productDis,price,dateAvalible);
            for (int i = 0; i < products.length; i++){
                productz[i] = new Product(products[i].getDescription(), products[i].getPrice(),products[i].getDateWhenAvalible());
            }
            productz[products.length] = productOne;
            ProductTester.product = productz;
        }else {
            Product productOne = new Product(productDis,price,dateAvalible);
            Product[] productz = {productOne};
            ProductTester.product = productz;
        }

    }

    public static void addProduct(Product[] products, Product productOne){
        if (products != null){
            Product[] productz = new Product[products.length + 1];
            for (int i = 0; i < products.length; i++){
                if(products[i].getClass() == Item.class){
                    productz[i] = new Item(products[i].getDescription(), products[i].getPrice(),products[i].getDateWhenAvalible(), 12);
                }else if(products[i].getClass() == Subscription.class){
                    productz[i] = new Subscription(products[i].getDescription(), products[i].getPrice(),products[i].getDateWhenAvalible());
                }else if(products[i].getClass() == Service.class){
                    productz[i] = new Service(products[i].getDescription(), products[i].getPrice(),products[i].getDateWhenAvalible());
                }else{
                    productz[i] = new Product(products[i].getDescription(), products[i].getPrice(),products[i].getDateWhenAvalible());
                }
            }
            productz[products.length] = productOne;
            ProductTester.product = productz;
        }else {
            Product[] productz = {productOne};
            ProductTester.product = productz;
        }

    }
}
