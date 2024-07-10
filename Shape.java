// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

abstract class Shape implements Scalable {

    // initialise empty methods to customize in each shape's clas
    public abstract String getName();

    public abstract double area();

    public abstract double perimeter();

    public abstract void scale(double scaleFactor);

    // Main toString() method
    public String toString() {
        return("Shape[name=" + this.getName() + ", area=" + this.area() + ", perimeter=" + this.perimeter() + "]");
    }

}