import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class ReadMoney {
	  public static void main(String argv[]) throws Exception {
		    FileInputStream fis = new FileInputStream("money.out");
		    ObjectInputStream ois = new ObjectInputStream(fis);
		  
		    while(true) {
		    	  try {
		    Money m = (Money) ois.readObject();
		    System.out.println("The money is: "+m);
		    
		    }
		    catch(EOFException e) {
		    	break;
		    }
		    }
		    
		    ois.close();
		    fis.close();
		  }
}
