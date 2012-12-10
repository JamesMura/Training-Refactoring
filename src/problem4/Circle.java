package problem4;

public class Circle extends Shape {
    private final Point origin;
    private final Integer radius;

    public Circle(Point origin, Integer radius) {
        this.origin = origin;
        this.radius = radius;
    }
    @Override
    public String draw(Graphics graphics) {
        return graphics.drawCircle(origin,radius);
    }


}
