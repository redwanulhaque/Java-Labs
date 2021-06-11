
public class Bill extends Money{
   private int dollars;
   
   public Bill (int d) {//d refers to the amount of the dollars
	   //safety checking
	   if(d!=1 && d!=5 && d!=10 && d!=20 && d!=100)// not 1, 5, 10, 20, 50 or 100
		   throw new IllegalBillException("bill amount is not valid");
      dollars = d;
   }
   public int getValue () {
      return dollars;
   }
   public String toString() {
	   return "$ "+dollars+".00";
   }
}
