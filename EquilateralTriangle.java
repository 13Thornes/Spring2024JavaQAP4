public class EquilateralTriangle extends Triangle {
    
    String name;
    double side;

    // Create constructors

   public EquilateralTriangle(String name, double side) {
    super(name, side, side, side);
   }

   // getters and setters
   public String getName() {
    return name;
   }

   public void setName(String name) {
    this.name = name;
   }

   public double getSide() {
    return side;
   }

   public void setSides(double side) {
    this.side1 = side;
    this.side2 = side;
    this.side3 = side;
    this.side = side;
   }

   // Area and perimeter
   public void getArea() {
    super.area();
   }

   public void getPerimeter() {
       super.perimeter();
   }

}
