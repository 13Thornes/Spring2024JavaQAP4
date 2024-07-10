// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

import java.util.ArrayList;

public class ShapeList {
    
    // initialize shapeList
    ArrayList<Shape> shapeList;

    // create constructor
    public ShapeList() {
        shapeList = new ArrayList<Shape>();
    }
    
    // method to add a shape to shapeList
    public void addShape(Shape s) {
        if(shapeList.contains(s)) {
            System.out.println("Already in list");
        } else {
            shapeList.add(s);
            System.out.println("Shape added");
        }
    }

    // method to remove a shape from shapeList
    public void remove(Shape s) {
        if(shapeList.contains(s)) {
            shapeList.remove(s);
        } else {
            System.out.println("Not found");
        }
    }

    // Loop to show each shape in shapeList
    public void showShapeList() {
        for (Shape shape : shapeList) {
            System.out.println(shape);
        }
    }
}
