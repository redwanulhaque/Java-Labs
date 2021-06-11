import javax.swing.*;

public class Lab6Program {
    static int counter=0; //static represents global variable
	public static void main(String[] args) {// input.txt output.txt
	//"java" wordArray[0]
		int[] wordArray=inputFromFile(args[0]);//args[0] represents the file name "lab5input.txt"
		
		
		// Output to a JOptionPane window whether the word is on the list or not
		JOptionPane.showMessageDialog(null, "Sum: "+sum(wordArray,counter)+"\n Average: "+average(wordArray, counter));
			
			} //main

	//read the word from the file and fill in the array
	public static int[] inputFromFile(String fileName) {
		TextFileInput tfi=new TextFileInput(fileName);//create an object of TextFileInput by calling the constructor
	    String line=tfi.readLine();//read the first line
	    int[] temp=new int[20];//the array is not full
	   
	    while(line!=null) {//read until the end of the file
	    	temp[counter++]=Integer.parseInt(line);
	    	line=tfi.readLine();//read the next line
	    }
	    
	    return temp;
	    
	}
	
	 public static int sum (int[] myArray, int myArraySize) {
		 int sum=0;
		 for(int i=0; i<myArraySize; i++) {
			 sum+=myArray[i];
		 }
		 return sum;
		 
	 }
	 
	 public static double average (int[] myArray, int myArraySize) {
		 return sum(myArray,myArraySize)/(double) myArraySize;
	 }



} // class Lab4Program1