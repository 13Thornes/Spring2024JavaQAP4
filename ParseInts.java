import java.util.Scanner;

public class ParseInts
{
    public static void main(String[] args)
    {
	int val, sum=0;
	Scanner scan = new Scanner(System.in);
	String line;

	System.out.println("Enter a line of text");
	Scanner scanLine = new Scanner(scan.nextLine());

    // Start the while loop
    while (scanLine.hasNext()) {
        // Try to add the values together
        try {
            {		
                val = Integer.parseInt(scanLine.next());
                sum += val;
                }
        // Catches any non integer, but does nothing
        } catch (NumberFormatException e) {
        
        }
    } 
    // Prints the sum
    System.out.println("The sum of the integers on this line is " + sum);

    }
}
