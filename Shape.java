

abstract class Shape {

    public abstract String getName();

    public abstract double area();

    public abstract double perimeter();

    
    public String toString() {
        return("Shape[name=" + this.getName() + ", area=" + this.area() + ", perimeter=" + this.perimeter() + "]");
    }

}