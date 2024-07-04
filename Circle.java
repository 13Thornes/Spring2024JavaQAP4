public class Circle extends Shape{

    // initialize variables
    String name;
    double radius;


    // create constructors
    public Circle() {
        this.name = "Default";
        this.radius = 2;
    }

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
    public void area() {
        double area = Math.PI * (radius * radius);
        System.out.println(area);
    }

    public void perimeter() {
        double perimeter = Math.PI * (radius * 2);
        System.out.println(perimeter);
    }

    // toString() method

    public String toString() {
        return("Shape Circle[name=" + name + ", radius=" + radius + "]");
    }
    
}
