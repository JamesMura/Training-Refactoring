package problem4;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LineTest {

    @Test
    public void shouldDrawALineGivenAGraphicsEngine() {
        Point p1 = new Point();
        Point p2 = new Point();

        Line line = new Line(p1, p2);
        assertEquals(line.draw(new Graphics()), "line");

    }
}
