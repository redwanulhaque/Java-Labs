import javax.swing.*;

public class Lab5Program {
    static int counter=0; //static represents global variable
	public static void main(String[] args) {// input.txt output.txt
	//"java" wordArray[0]
		String[] wordArray=inputFromFile(args[0]);//args[0] represents the file name "lab5input.txt"
		String isOrIsNot, inputWord;
		
			while(true) { //infinite loop
		// This line asks the user for input by popping out a single window
		// with text input
		inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");//GUI
		if(inputWord.equalsIgnoreCase("STOP")) {
			System.exit(0);//terminate the program
		}
		// if the inputWord is contained within wordArray return true
		if (wordIsThere(inputWord, wordArray)) 
			isOrIsNot = "is"; // set to is if the word is on the list
		else
			isOrIsNot = "is not"; // set to is not if the word is not on the list
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
			}
			} //main

	//read the word from the file and fill in the array
	public static String[] inputFromFile(String fileName) {
		TextFileInput tfi=new TextFileInput(fileName);//create an object of TextFileInput by calling the constructor
	    String line=tfi.readLine();//read the first line
	    String[] temp=new String[20];//the array is not full
	    int i=0;
	    while(line!=null) {//read until the end of the file
	    	temp[i++]=line;//put the word into the array
	    	counter++;//the actual number of words
	    	line=tfi.readLine();//read the next line
	    }
	    
	    return temp;
	    
	}
	//search if the user input is in the array or not
	public static boolean wordIsThere(String findMe, String[] theList) {
             for(int i=0;i<counter;i++) {
            	 if(findMe.equals(theList[i]))
            		 return true;
            		 
             }
             return false;
             
	} // wordIsThere
} // class Lab4Program1