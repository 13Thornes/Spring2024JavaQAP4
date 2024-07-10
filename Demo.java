public class Demo {
    public static void main(String[] args) {

        ScaleList sc1 = new ScaleList();

        Circle c1 = new Circle("Circle", 5);

        sc1.addScale(c1);

        Triangle t1 = new Triangle("Triangle", 3, 4, 5);

        sc1.addScale(t1);

        EquilateralTriangle et1 = new EquilateralTriangle("Equilateral Triangle", 3);

        sc1.addScale(et1);

        Ellipse e1 = new Ellipse("Ellipse", 4, 5);

        sc1.addScale(e1);

        sc1.scaleList(2);


        

        


        

        

        


    }
}