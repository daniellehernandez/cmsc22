public class Account{

      private int accountNumber;
      private double balance;

      public Account(int x, double y){

            this.accountNumber = x;
            this.balance = y;

      }

      public String toString(){
           return String.format("A/C no: %d Balance = %.2f \n", this.accountNumber, this.balance);
      }

      public Account(int x){
            this(x,0.0);
      }

      public int getAccountNumber(){
            return accountNumber;
      }

      public double getBalance(){
            return balance;
      }

      public void setBalance(double balance){
            this.balance = balance;
      }

      public void credit(double amount){
            this.balance += amount;
      }

      public void debit(double amount){

         if(balance >= amount){
            this.balance -= amount;
         } else {
            System.out.println("Amount withdrawn exceeds the current balance");
         }   
      }


}