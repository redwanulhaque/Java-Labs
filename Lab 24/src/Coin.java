
public abstract class Coin extends Money  {
   private int value;//cents amount
   
   public Coin(int v) {
      value = v;
   }
   public int getValue () {
      return value;
   }
   public String toString() {//string representation 
	   if (value<10)
      return ("$ 0.0"+value);
	return ("$ 0."+getValue());
		   
   }
}
