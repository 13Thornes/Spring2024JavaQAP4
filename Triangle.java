// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

public class Triangle extends Shape{

    // initialize variables
    String name;
    double side1;
    double side2;
    double side3;
    double area;
    double perimeter;

    // create constructor
    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
        
        // validate if shape is a valid triangle
          if(side1 + side2 < side3) {
            throw new ArithmeticException("Triangle is invalid");
          } else {
            if(side2 + side3 < side1) {
                throw new ArithmeticException("Triangle is invalid");
            } else {
                if(side3 + side1 < side2) {
                    throw new ArithmeticException("Triangle is invalid");
                } else {
                    // System.out.println("Triangle is valid");
                }
            } 
          };
        
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSide1() {
        return side1;
    }

    public void setSideA(double a) {
        this.side1 = a;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(double b) {
        this.side2 = b;
    }

    public Double getSide3() {
        return side3;
    }

    public void setSide3(double c) {
        this.side3 = c;
    }

    // Area and perimiter
    public double area() {
        double s = ((side1 + side2 + side3) / 2);
        area = Math.sqrt(s * (s-side1) * (s-side2) * (s-side3));
        return area;
    }

    public double perimeter() {
        perimeter = side1 + side2 + side3;
        return perimeter;
    }

    // Scale method
    public void scale(double scaleFactor) {
        this.side1 = side1 * scaleFactor;
        this.side2 = side2 * scaleFactor;
        this.side3 = side3 * scaleFactor;
        area = this.area();
        perimeter = this.perimeter();
    }

    // toString()
    public String toString() {
        return(super.toString());
    }
}