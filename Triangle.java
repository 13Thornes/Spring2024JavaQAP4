public class Triangle extends Shape{
    String name;
    double sideA;
    double sideB;
    double sideC;

    // create constructors
    public Triangle() {
        this.name = "Default";
        this.sideA = 3;
        this.sideB = 4;
        this.sideC = 5;
    }

    public Triangle(String name, double a, double b, double c) {
        this.name = name;
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(double a) {
        this.sideA = a;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(double b) {
        this.sideB = b;
    }

    public Double getSideC() {
        return sideC;
    }

    public void setSideC(double c) {
        this.sideC = c;
    }

    // Area and perimiter

    public void area() {
        double height = ((sideA * sideB) / sideC);
        double base = sideC;
        double area = ((base * height) / 2);
        System.out.println(area);
    }

    public void perimeter() {
        double perimeter = sideA + sideB + sideC;
        System.out.println(perimeter);
    }
}
