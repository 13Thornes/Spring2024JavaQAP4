abstract class Shape {

    String name;

    public abstract void area();

    public abstract void perimeter();

    public String toString() {
        return("Shape[name=" + name + "]");
    }

}