
class BankAccount{
 private String accountholdername;
 private double balance;
 public BankAccount(String name,double balance){
    this.accountholdername = name;
    this.balance = balance;
 }
 public String  getAccountHolderName(){
   return accountholdername;
 }
 public double  getBalance(){
   return balance;

 }
 public void withdraw(double amount){
    if(amount<0){
        System.out.println("unable to debit as its a negative amount ");
    }
    else if(balance >= amount){
        balance = balance - amount;
        System.out.println("Amount withdrawn is : "+amount);
        System.out.println("Remaining balance is : "+balance);
    }else{
        System.out.println("Insufficient balance to withdraw the amount");
    }
 }
 public void deposit(double amount){
    balance = balance + amount;
    System.out.println("Amount deposited is :"+ amount);
    System.out.println("Remaining balance is : "+balance);

 }

}
public class Encapsulation { 
    
    public static void main(String[] args) {
   BankAccount obj = new BankAccount("SML",2000000);
   System.out.println("Account holder name is :"+ obj.getAccountHolderName());
   obj.deposit(100000);
   System.out.println("remaining account balance is :"+obj.getBalance());



}
}

