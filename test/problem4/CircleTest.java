package problem4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircleTest {

    @Test
    public void shouldBeAbleToDrawItselfGivenAGraphicsEngine() {
        Point origin = new Point();
        Integer radius = 1;

        Circle circle = new Circle(origin, radius);
        assertEquals(circle.draw(new Graphics()), "circle");

    }
}
