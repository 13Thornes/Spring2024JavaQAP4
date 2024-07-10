// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

import java.util.ArrayList;

public interface Scalable {

    // initialize scaleList
    public static final ArrayList<Scalable> scaleList = new ArrayList<Scalable>();

    // define scale method
    public void scale(double scaleFactor);
    
}
