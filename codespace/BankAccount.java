public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    public BankAccount(String accountNumber, String accountHolderName, String accountType) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountType=accountType;
		this.balance=0;
    }
    public BankAccount(String accountNumber, String accountHolderName,
                        String accountType, double initialDeposit) {
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.accountType=accountType;
		this.balance=initialDeposit;					
	}
	
 
    public void deposit(double amount) {
		balance +=amount;
    }
 
    public void withdraw(double amount) {
		if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }
 
    public double getBalance() {
		return balance;
    }
 
    public void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
class BankInfo{
public static void main(String[] args) {
        BankAccount b1 = new BankAccount("101", "Tharunasree", "Savings", 5000);

        b1.displayAccountInfo();

        b1.deposit(1000);
        System.out.println("After Deposit:");
        b1.displayAccountInfo();

        b1.withdraw(2000);
        System.out.println("After Withdrawal:");
        b1.displayAccountInfo();
    }
}