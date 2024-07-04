public class EquilateralTriangle extends Triangle {
    
    String name;
    double side;
    double area;
    double perimeter;

    // Create constructors

   public EquilateralTriangle(String name, double side) {
    super(name, side, side, side);
    this.name = name;
    this.side1 = side;
    this.side2 = side;
    this.side3 = side;
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
   public double getArea() {
    return super.area();
   }

   public double getPerimeter() {
      return super.perimeter();
   }

   // toString()
   public String toString() {
    // return("Shape EquilateralTriangle[name=" + name + ", area=" + this.getArea() + ", perimeter=" + this.getPerimeter() + "]");
    return(super.toString());
}

}
