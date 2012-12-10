package problem4;

public class Line extends Shape {
    private final Point start;
    private final Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }
        @Override
    public String draw(Graphics graphics) {
        return graphics.drawLine(start,end);
    }
}
