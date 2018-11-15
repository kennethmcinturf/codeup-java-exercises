package shapes;

public class Square extends Rectangle {
    private int Side;

    public int getSide() {
        return Side;
    }

    public void setSide(int side) {
        Side = side;
    }


    public Square(int side){
        super(side,side);
        Side = length;
        Side = width;
    }

    @Override
    public int getPerimeter(){
        return (4 * getSide());
    }

    @Override
    public int getArea(){
        return (getSide()) * (getSide());
    }
}
