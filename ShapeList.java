import java.util.ArrayList;

public class ShapeList {
    ArrayList<Shape> shapeList;

    public ShapeList() {
        shapeList = new ArrayList<Shape>();
    }
    

    public void addShape(Shape s) {
        if(shapeList.contains(s)) {
            System.out.println("Already in list");
        } else {
            shapeList.add(s);
            System.out.println("Shape added");
        }
    }

    public void remove(Shape s) {
        if(shapeList.contains(s)) {
            shapeList.remove(s);
        } else {
            System.out.println("Not found");
        }
    }

    public void showShapeList() {
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }
}
