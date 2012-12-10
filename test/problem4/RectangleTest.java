package problem4;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest   {

    @Test
    public void shouldDrawRectangleGivenGraphics() {
       Point p1 = new Point();
       Point p2 = new Point();

        Rectangle rect = new Rectangle(p1,p2);

        assertEquals(rect.draw(new Graphics()),"rectangle");
    }

}
