import java.util.ArrayList;

public class ScaleList {
    ArrayList<Scalable> scaleList;

    public ScaleList() {
        scaleList = new ArrayList<Scalable>();
    }
    

    public void addScale(Shape s) {
        if(scaleList.contains(s)) {
            System.out.println("Already in list");
        } else {
            scaleList.add(s);
            System.out.println("Shape added");
        }
    }

    public void remove(Shape s) {
        if(scaleList.contains(s)) {
            scaleList.remove(s);
        } else {
            System.out.println("Not found");
        }
    }

    public void scale(Shape s, double scaleFactor) {
        
    };

    public void scaleList(double scaleFactor) {
        for (Scalable scalable : scaleList) {
            System.out.println("Before: " + scalable.toString());
            scalable.scale(scaleFactor);
            System.out.println("After " + scalable.toString());
        }
    }
}

