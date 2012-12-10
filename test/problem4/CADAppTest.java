package problem4;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CADAppTest {

    private CADApp app = new CADApp();
    private Line line = new Line(new Point(), new Point());
    private Circle circle = new Circle(new Point(), 1);
    private Rectangle rectangle = new Rectangle(new Point(), new Point());

    @Test
    public void shouldDrawALineGivenALineShape() {
        Shape[] shapes = {line}; // Arrange
        String expected = app.drawShapes(new Graphics(), shapes); //Act
        assertEquals(expected, "line"); // Assert
    }

    @Test
    public void shouldDrawACircleGivenACircleShape() {
        Shape[] shapes = {circle};
        String expected = app.drawShapes(new Graphics(), shapes);
        assertEquals(expected, "circle");
    }

    @Test
    public void shouldDrawARectangleGivenARectangleShape() {
        Shape[] shapes = {rectangle};
        String expected = app.drawShapes(new Graphics(), shapes);
        assertEquals(expected, "rectangle");
    }


}
