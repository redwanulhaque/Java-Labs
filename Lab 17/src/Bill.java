
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) {//d refers to the amount of the dollars
      dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   public String toString() {
	   return "$ "+dollars+".00";
   }
}