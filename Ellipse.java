public class Ellipse extends Shape {
    String name;
    double a;
    double b;
    double area;
    double perimeter;

    // create constructors
    public Ellipse (String name, double axe1, double axe2) {
        this.name = name;
        if(axe1 > axe2) {
            this.a = axe1;
            this.b = axe2;
            System.out.println("Ellipse created");
        } else {
            if(axe2 > axe1) {
                this.a = axe2;
                this.b = axe1;
            } else {
                throw new ArithmeticException("Axes cannot be the same size");
            }
            
        }
    }


    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if(a > this.b) {
            this.a = a;
        } else {
            throw new ArithmeticException("a must be greater than b");
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(this.a > b) {
            this.b = b;
        } else {
            throw new ArithmeticException("b must be less than a");
        }
    }

    // Area and perimeter

    public double area() {
        area = Math.PI * a * b;
        return area;
    }

    public double perimeter() {
       
        double step1 = 2 * ((Math.pow(a, 2)) + (Math.pow(b, 2)));
        double step2 = ((Math.pow(a-b, 2))/2);
        double step3 = step1 - step2;
        double perimeter = (Math.PI * (Math.sqrt(step3)));
        return perimeter;
    }

    public void scale(double scaleFactor) {
        this.a = a * scaleFactor;
        this.b = b * scaleFactor;
        area = this.area();
        perimeter = this.perimeter();
    }

}
