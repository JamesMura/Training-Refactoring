package problem4;

public class CADApp {
    String drawShapes(Graphics graphics, Shape[] shapes) {
        String shape="";
        for (int i = 0; i < shapes.length; i++) {
             shape = shapes[i].draw(graphics);
        }
        return shape;
    }


}
