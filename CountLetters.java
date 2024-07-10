// Project: Java QAP4 
// Author: Samantha Thorne
// Date: July 4-10 2024

import java.util.Scanner;
public class CountLetters{
    public static void main(String[ ] args)
    {
    // int letterIndex;
    
	int[ ] counts = new int[26];
	Scanner scan = new Scanner(System.in);

	//get word from user
	System.out.print("Enter a single word (letters only, please): ");
	String word = scan.nextLine( );

	//convert to all upper case
	word = word.toUpperCase( );
    
    try {
        //count frequency of each letter in string
        for (int i=0; i < word.length( ); i++) {
            counts[word.charAt(i)-'A']++;
        }
        
    } catch (Exception e) {
        // Loop through characters to see if character is a letter
        for (int i=0; i < word.length( ); i++) {
            int letterIndex = word.charAt(i)-'A';
            char letter = word.charAt(i);
            if(Character.isLetter(word.charAt(i))) {
                // Letter is valid, do nothing
            } else {
                // Exception to print the word space instead of blank character
                if (Character.isSpaceChar(letter)){
                    System.out.println("Incorrect character used. Character used: Space");
                } else {
                    // Prints exception message and character
                    System.out.println("Incorrect character used. Character used: " + letter);
                }
            } 
        }
        // Throws out of bounds error
        throw new IndexOutOfBoundsException();
    }
	
	//print frequencies
	System.out.println( );
	for (int i=0; i < counts.length; i++)
	    if (counts [i] != 0)
		System.out.println((char)(i +'A') + ": " + counts[i]);

    } 
}