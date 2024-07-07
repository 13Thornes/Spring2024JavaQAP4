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
   public double area() {
    return super.area();
   }

   public double perimeter() {
      return super.perimeter();
   }

   // Scale method
   public void scale(double scaleFactor) {
    this.side = side * scaleFactor;
    this.side1 = side1 * scaleFactor;
    this.side2 = side2 * scaleFactor;
    this.side3 = side3 * scaleFactor;
    area = this.area();
    perimeter = this.perimeter();
   }

   // toString()
   public String toString() {
    // return("Shape EquilateralTriangle[name=" + name + ", area=" + this.getArea() + ", perimeter=" + this.getPerimeter() + "]");
    return(super.toString());
}

}
