package hafta2_Pratik_Ders;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}

