package snehajain;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat(" '$'###,##0.00");
	 
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	 
	public void getLogin() {
		int x=1;
		do {
			try {
				data.put(102030,1020);
				data.put(989947,71976);
				
				System.out.println("Welcome to the ATM Project!");
				System.out.println("Enter your custmor Number:");
				setCustmorNumber(menuInput.nextInt());
				
				System.out.print("Enter your PIN Number: ");
				setPinNumber(menuInput.nextInt());
				
				
			}
			catch(Exception e) {
				System.out.println("\n"+ "Invalid Character(s).Only Numbers."+"\n");
				x=2;
			}
			
			
			for(HashMap.Entry<Integer,Integer> entry :data.entrySet()) {
				if(entry.getKey()== getCustmorNumber() && entry.getValue()==getPinNumber()) {
			
			
				getAccountType();
				}
			}
			System.out.println("\n"+"Wrong number "+"\n");
			
		}while(x==1);
		
		}
		public void getAccountType() {

			System.out.println("Select the account you want to Access: ");
			System.out.println("Type 1 -Checking Account");
			System.out.println("Type 2 - Saving Account");
			System.out.println("Type 3 - Exit");
			System.out.println("choice:");
			int selection =menuInput.nextInt();
			switch(selection) {
			case 1:
				getChecking();
				break;
			case 2:
				getSaving();
				break;
			case 3:
				System.out.println("Thank You for using this ATM ,bye. \n");
				break;
				default:
					System.out.println("\n" +"Invalid Choice ."+"\n");
				
}
		}
			
public void getChecking() {
				System.out.println("Checking Account:");
				System.out.println("Type 1 -View Balance ");
				System.out.println("Type 2 - Withdraw Funds");
				System.out.println("Type 3 - Deposit Funds");
				System.out.println("Type 4 - Exit");
				System.out.print("Choice: ");
			
			
			int selection=menuInput.nextInt();
			 switch(selection) {
			 case 1:
					System.out.println("Checking Account Balance:" + moneyFormat.format(getCheckingBalance()));
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
      System.out.println("\n"+"Invalid Choice."+"\n");
      getChecking();
      default:
    	  System.out.println("\n"+"Invalid Choice."+"\n");
				 
}
		
	}

	public void getSaving() {
		System.out.println("Saving Account:");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw funds");
		System.out.println("Type 3 - Deposit funds");
		System.out.println("Type 4 -Exit");
		System.out.println("Choice: ");
		
	int selection =menuInput.nextInt();
	switch(selection) {
		case 1:
			System.out.println("Saving Account Balance:"  + moneyFormat.format( getSavingBalance()));
			getAccountType();
			break;
		case 2:
			getsavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("thank you for using atm,bye.");
			break;
			default:
				System.out.println("\n"+"Invalid Choice."+"\n");
				getChecking();
	}
	}
			
			
}