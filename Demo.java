// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

public class Demo {
    public static void main(String[] args) {

        // Create new scaleList
        ScaleList sc1 = new ScaleList();

        // Create shapes
        Circle c1 = new Circle("Circle", 5);

        Triangle t1 = new Triangle("Triangle", 3, 4, 5);

        EquilateralTriangle et1 = new EquilateralTriangle("Equilateral Triangle", 3);

        Ellipse e1 = new Ellipse("Ellipse", 4, 5);



        // Add shapes to scaleList
        sc1.addScale(c1);

        sc1.addScale(t1);

        sc1.addScale(et1);

        sc1.addScale(e1);


        // Scale the shapes
        sc1.scaleList(2);


        

        


        

        

        


    }
}