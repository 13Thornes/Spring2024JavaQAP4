public class Demo {
    public static void main(String[] args) {

        ShapeList s1 = new ShapeList();

        Circle c1 = new Circle("Red", 5);
        
        s1.addShape(c1);

        Triangle t1 = new Triangle("Green", 3, 4, 5);

        s1.addShape(t1);

        EquilateralTriangle et1 = new EquilateralTriangle("Blue", 3);

        s1.addShape(et1);

        s1.showShapeList();
        

        


    }
}