public class Rectangle extends Shape implements Drawable{

    private int sideA, sideB;

    public Rectangle(){
        super();
    }
    public Rectangle(String color, int sideA, int sideB){
        super(color);
        this.sideA = 1;
        this.sideB = 1;
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public double perimeter() {
        return 2*(sideA + sideB);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) obj;
        return sideA == rectangle.sideA && sideB == rectangle.sideB;
    }

    @Override
    public void draw() {
        System.out.println("A rectangle is drawn");
    }
}
