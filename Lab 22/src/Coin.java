
public abstract class Coin extends Money {
	
   private int value;
   
   public Coin(int v) {//v refers to the amount of the cents
      value = v;
   }
   
   public int getValue () {
      return value;
   }
   
   public String toString() {//string representation of the coin class
	   if(value<10)
      return ("$ 0.0"+getValue());
	   return ("$ 0."+getValue());
   }
   
}
