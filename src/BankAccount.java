public class BankAccount{
   public static void main(String[] ars) {
       // starting val
       float startBalance = 2175.37F;
       
       // print starting balance
       System.out.println("Current bank balance: " + startBalance);
       
       // Calculate
       startBalance -= 302.50;
       startBalance += 50.03;
       startBalance /= 2;
       startBalance += 20;
       startBalance -= 1;
       startBalance *= 2;
       startBalance += 1;
       
       // print out balance after; format to have two digits after decimal point
       System.out.println("Bank balance after transactions: " + String.format("%.2f", startBalance));
   }
}