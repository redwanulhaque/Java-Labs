public class Lab7Program {

	public static int[][] myArray;
	
	public static void main(String[] args) {
		//printArray(myArray);
		myArray=fillArray(args[0]);//args[0] represent the file name twodimension.txt
		printArray(myArray);
		printArrayEven(myArray);
	}
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		if(num%2==0)
		{if (num<10)
		System.out.print(num+"  ");//single digit number has two space
		else
			System.out.print(num+" ");//two digits number has only one space
			
		}
		else
			System.out.print("*  ");//has two space
			
	}
	private static void printArrayEven(int[][] theArray){
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	
	public static int[][] fillArray(String myFile){
		TextFileInput tfi=new TextFileInput(myFile);//create an object by calling the constructor
		int row=Integer.parseInt(tfi.readLine());//read the first line, "4"
		int col=Integer.parseInt(tfi.readLine());//read the second line, "5"
		int [][] arr=new int [row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=Integer.parseInt(tfi.readLine());
			}
		}
		
		return arr;
		
	}
}