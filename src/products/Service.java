package products;

public class Service extends Product {
    protected int timeToComplete;

    public Service(String description, int price, int dateWhenAvalible) {
        super(description, price, dateWhenAvalible);
    }

    public int getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(int timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public void orderingNewProduct(){
        System.out.println("Hiring new employees..");
    }

    public void productOrdered(){
        orderingNewProduct();
        System.out.println("Employees Hired!!");
    }
}
