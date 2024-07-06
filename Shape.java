

abstract class Shape implements Scalable {

    public abstract String getName();

    public abstract double area();

    public abstract double perimeter();

    public abstract void scale(double scaleFactor);

    
    public String toString() {
        return("Shape[name=" + this.getName() + ", area=" + this.area() + ", perimeter=" + this.perimeter() + "]");
    }

}