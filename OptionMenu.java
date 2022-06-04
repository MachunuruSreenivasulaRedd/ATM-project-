import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Account{
	Scanner menuInput =new Scanner(System.in);
			DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data =new HashMap<Integer,Integer>();
	public void getLogin() throws IOException {
		int x=1;
		do {
			try {
				data.put(1234,2345);
				data.put(2345,3456);
				
				System.out.println("welcome to srinivas's ATM project");
				System.out.println("Enter your customer number");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your PIN number");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e) {
				System.out.println("\n"+"INVALID character(s).Only numbers."+"\n");
				x=2;
				
			}

      
      
int cn=getCustomerNumber();
int pn=getPinNumber();
if(data.containsKey(cn) && data.get(cn)==pn) {
	getAccountType();
}
else {
	System.out.println("\n"+"wrong customer Number or pin number");
}
      }
while(x==1);
}

public void getAccountType() {
	System.out.println("Select the account you want to access");
	System.out.println("press 1-checking Account");
	System.out.println("press 2-Saving Account");
	System.out.println("press 3-Exit");
	
	int selection=menuInput.nextInt();
	switch(selection) {
	case 1:
		getChecking();
		break;
		
	
	case 2:
		getSaving();
		break;
	case 3:
	System.out.println("thank  you for using this atm,see you later.\n");
	break;

default:
	System.out.println("\n"+"INVALID choice"+"\n");
	getAccountType();
	}
}
public void getChecking() {
	System.out.println("checking Account");
    System.out.println("press 1-view Balance");
    System.out.println("press 2-withdraw Funds");
    System.out.println("press 3-Deposit Funds");
    System.out.println("press 4-Exit");
    int selection=menuInput.nextInt();
    switch(selection) {
    case 1:
    	System.out.println("checking account balance "+moneyFormat.format(SavingBalance));
    	getAccountType();
    	break;
   	case 2:
   		getCheckingWithdrawInput();
   		getAccountType();
   		break;
   	case 3:
   		getCheckingDepositInput();
   		getAccountType();
   		break;
   	case 4:
   		System.out.println("thank you for using our ATM service"+"\n");
   		break;
   	default:
   		System.out.println("\n"+"INVALID choice"+"\n");
   		getChecking();
   		
   	
   		
    }
}
public void getSaving() {
	System.out.println("Saving account");
    System.out.println("press 1-view Balance");
    System.out.println("press 2-withdraw Funds");
    System.out.println("press 3-Deposit Funds");
    System.out.println("press 4-Exit");
    int selection=menuInput.nextInt();
    switch(selection) {
    case 1:
    	System.out.println("Saving account balance "+moneyFormat.format(SavingBalance));
    	getAccountType();
    	break;
   	case 2:
   		getSavingWithdrawInput();
   		getAccountType();
   		break;
   	case 3:
   		getSavingDepositInput();
   		getAccountType();
   		break;
   	case 4:
   		System.out.println("thank you for using our ATM service"+"\n");
   		break;
      default:
   		System.out.println("\n"+"INVALID choice"+"\n");
   		getSaving();
    }
}

	
}
		
