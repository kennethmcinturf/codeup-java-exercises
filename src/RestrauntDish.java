public class RestrauntDish {
    private int costInCents;

    public void setCostInCents(int costInCents) {
        this.costInCents = costInCents;
    }

    public int getCostInCents() {
        return costInCents;
    }


    private String nameOfDish;

    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }
    public String getNameOfDish(){
        return nameOfDish;
    }


    private Boolean wouldRecommend;

    public void setWouldRecommend(Boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }

    public Boolean getWouldRecommend(){
        return wouldRecommend;
    }


    private void eat(){
        System.out.println("Nom Nom");
    }
}
