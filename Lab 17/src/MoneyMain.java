import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyMain {
   
   static String[] dataSource =  {"B5","Q","B20","Q","P","N","D"};
   static Money[] wallet = new Money[dataSource.length];
   
   public static void main (String[] args) {
            
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         if (dataItem == 'B') {
        	
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            wallet[i]= new Bill(billValue);
         }   
         else {
            if (dataItem == 'Q')
               wallet[i]=new Quarter();
            if (dataItem=='P')
            	wallet[i]=new Penny();
            if (dataItem=='N')
            	wallet[i]=new Nickel();
            if(dataItem=='D')
            	wallet[i]=new Dime();
         }
         }
      printWallet();
      sumWallet();
   }
   public static void printWallet () {
      for (int i=0;i<wallet.length;i++) {
    	  System.out.println(wallet[i]);
    	  /*
         if (wallet[i] instanceof Bill)//instanceof type of a particular class
            System.out.println("$ "+((Bill)wallet[i]).getValue()+".00");
         else
            System.out.println(wallet[i]);//coin has toString() method, wallet[i].toString()
         */
      }
   }
   
   public static void sumWallet() {
	   double sum=0;
	   for (int i=0;i<wallet.length;i++) {
		   if (wallet[i] instanceof Bill)
			   sum+=((Bill)wallet[i]).getValue();
		   else
			   sum+=((Coin)wallet[i]).getValue()/100.0;
		   
	   }
	  
	   Double toBeTruncated = new Double(sum);

	   Double truncatedDouble = BigDecimal.valueOf(toBeTruncated)
	       .setScale(2, RoundingMode.HALF_UP)
	       .doubleValue();
	   System.out.println("sum is : "+truncatedDouble );
	   
   }
}

