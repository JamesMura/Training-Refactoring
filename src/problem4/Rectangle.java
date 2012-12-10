package problem4;


public class Rectangle extends Shape  {


    private final Point p1;
    private final Point p2;

    public Rectangle(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    public String draw(Graphics graphics) {
        return graphics.drawRectangle(p1, p2);
    }
}
