public class Demo {
    public static void main(String[] args) {

        ShapeList s1 = new ShapeList();

        ScaleList sc1 = new ScaleList();

        Circle c1 = new Circle("Red", 5);

        System.out.println(c1.area());

        sc1.addScale(c1);
        
        s1.addShape(c1);

        Triangle t1 = new Triangle("Green", 3, 4, 5);

        System.out.println(t1.area());

        sc1.addScale(t1);

        s1.addShape(t1);

        
        EquilateralTriangle et1 = new EquilateralTriangle("Blue", 3);

        System.out.println(et1.area());

        s1.addShape(et1);

        sc1.addScale(et1);

        s1.showShapeList();

        sc1.scaleList(2);

        

        


        

        

        


    }
}