import java.text.DecimalFormat;
import java.util.Scanner;
public class Account {
	private int CustomerNumber;
	private int PinNumber;
	public double CheckingBalance=0;
	public double SavingBalance=0;
	Scanner input =new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	public int setCustomerNumber(int CustomerNumber) {
		this.CustomerNumber=CustomerNumber;
		return CustomerNumber;
	}
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public int setPinNumber(int PinNumber) {
		this.PinNumber=PinNumber;
		return PinNumber;
	}
	public int getPinNumber() {
		return PinNumber;
	}
	public double getCheckingBalance() {
		return CheckingBalance;
		
	}
	public double getSavingBalance() {
		return SavingBalance;
		
	}
	public double calcCheckingWithdraw(double amount) {
		CheckingBalance=(CheckingBalance-amount);
		return CheckingBalance;
	}
	public double calcSavingWithdraw(double amount) {
		SavingBalance=(SavingBalance-amount);
		return SavingBalance;
		
	}
	public double calcCheckingDeposit(double amount) {
		CheckingBalance=(CheckingBalance+amount);
		return CheckingBalance;
	}
	public double calcSavingDeposit(double amount) {
		SavingBalance=(SavingBalance+amount);
		return SavingBalance;
		
	}
	public void getCheckingWithdrawInput() {
		System.out.println("checking Account Balance:"+moneyFormat.format(CheckingBalance));
		System.out.print("Enter the amount you want to withdraw from checking Account");
		double amount=input.nextDouble();
		
		if((CheckingBalance-amount)>=0) {
			calcCheckingWithdraw(amount);
      System.out.println("please collect the amount "+moneyFormat.format(amount));
			System.out.println("New checking Account Balance is"+moneyFormat.format(CheckingBalance));
		
		}
		else {
			System.out.println("Entered amount is not available in Account");
		}
		}
	public void getCheckingDepositInput() {
		System.out.println("Checking Balance"+moneyFormat.format(CheckingBalance));
		System.out.println( "Enter the amount to Deposit in Checking Account");
		double amount=input.nextDouble();
		if((CheckingBalance+amount)>=0) {
			calcCheckingDeposit(amount);
      
			System.out.println("New checking Account Balance is"+moneyFormat.format(CheckingBalance));
		}
		else {
			System.out.println("Entered amount is not available in Account");
		}
	}
	public void getSavingWithdrawInput() {
		System.out.println("saving Account Balance:"+moneyFormat.format(SavingBalance));
		System.out.print("Enter the amount you want to withdraw from saving Account");
		double amount=input.nextDouble();
		
		if((SavingBalance-amount)>=0) {
			calcSavingWithdraw(amount);
      System.out.println("please collect the amount "+moneyFormat.format(amount));
			System.out.println("New checking Account Balance is"+moneyFormat.format(SavingBalance));
		
		}
		else {
			System.out.println("Entered amount is not available in Account");
		}
		}
	public void getSavingDepositInput() {
		System.out.println("Saving Balance"+moneyFormat.format(SavingBalance));
		System.out.println( "Enter the amount to Deposit in Saving Account");
		double amount=input.nextDouble();
		if((SavingBalance)>=0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Account Balance is"+moneyFormat.format(SavingBalance));
		}
		else {
			System.out.println("Entered amount is not available in Account");
		}
	}
	
}
