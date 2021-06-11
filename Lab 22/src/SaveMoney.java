import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class SaveMoney {
	 public static void main(String argv[]) throws Exception {
		    FileOutputStream fos = new FileOutputStream("money.out");
		    ObjectOutputStream oos = new ObjectOutputStream(fos);
		    for(int i=1;i<=10;i++) {
		    Quarter q=new Quarter();
		    oos.writeObject(q);
		    Dime d=new Dime();
		    oos.writeObject(d);
		    Penny p=new Penny();
		    oos.writeObject(p);
		    }
		    oos.flush();
		    oos.close();
		    fos.close();
		  }
}
