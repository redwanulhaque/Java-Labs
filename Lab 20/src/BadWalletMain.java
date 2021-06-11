
public class BadWalletMain {
   
   static String[] dataSource =  {"B5","Q","B18","Q","B10","P","N","BAD","D","Q","D"};
   static Wallet myWallet = new Wallet();
   
   public static void main (String[] args) {
         
      for (int i=0;i<dataSource.length;i++){
         char dataItem = dataSource[i].charAt(0);
         try {
         if (dataItem == 'B') {
            int billValue= Integer.parseInt(dataSource[i].substring(1,dataSource[i].length()));
            
            myWallet.addToWallet(new Bill(billValue));//trigger the exception
         }   
       
         else {
            if (dataItem == 'Q')
               myWallet.addToWallet(new Quarter());
            else
            if (dataItem == 'D')
               myWallet.addToWallet(new Dime());
            else
            if (dataItem == 'N')
               myWallet.addToWallet(new Nickel());
            else
            if (dataItem == 'P')
               myWallet.addToWallet(new Penny());
         }
         }
         catch(IllegalBillException e) {
        	 System.out.println(e.getMessage());
         }
         catch(NumberFormatException e) {
        	 System.out.println(e.getMessage());
         }
         
         }
      
	  myWallet.print();
	  System.out.println("My wallet contains: $"+myWallet.getValue());
   }
   
   }

