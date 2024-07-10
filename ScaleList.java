// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

import java.util.ArrayList;

public class ScaleList {

    // initialize scaleList
    ArrayList<Scalable> scaleList;

    // create constructor
    public ScaleList() {
        scaleList = new ArrayList<Scalable>();
    }
    
    // method to add shape to scaleList
    public void addScale(Shape s) {
        if(scaleList.contains(s)) {
            System.out.println("Already in list");
        } else {
            scaleList.add(s);
            System.out.println("Shape added");
        }
    }

    // method to remove shape to scaleList
    public void remove(Shape s) {
        if(scaleList.contains(s)) {
            scaleList.remove(s);
        } else {
            System.out.println("Not found");
        }
    }

    // empty scale method to be customized in each shape's class
    public void scale(Shape s, double scaleFactor) {
        
    };

    // loop to print the shapes before and after scaling them
    public void scaleList(double scaleFactor) {
        for (Scalable scalable : scaleList) {
            System.out.println("Before: " + scalable.toString());
            scalable.scale(scaleFactor);
            System.out.println("After " + scalable.toString());
        }
    }
}

