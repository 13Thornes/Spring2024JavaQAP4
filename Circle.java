public class Circle extends Shape{

    // initialize variables
    String name;
    double radius;
    double area;
    double perimeter;


    // create constructors
    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    // Area and perimeter from the Shape class
    public double area() {
        area = Math.PI * (radius * radius);
        return area;
    }

    public double perimeter() {
        perimeter = Math.PI * (radius * 2);
        return perimeter;
    }

    // Scale method

    public void scale(double scaleFactor) {
        this.radius = radius * scaleFactor;
        area = this.area();
        perimeter = this.perimeter();
    }

    // toString() method

    public String toString() {
        return(super.toString());
    }
    
}