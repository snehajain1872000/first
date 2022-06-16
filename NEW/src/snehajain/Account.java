package snehajain;

import java.text.DecimalFormat;
import java.util.Scanner;


	public class Account {
		private int custmerNumber;
		private int pinNumber;
		private double checkingBalnce=0;
		private double savingBalance=0;
		
		Scanner input=new Scanner(System.in);
		DecimalFormat moneyFormat=new DecimalFormat("'$',###,##0.00");
		
		public int setCustmorNumber(int  custmerNumber) {
			this. custmerNumber= custmerNumber;
			return  custmerNumber;
		}
		public int getCustmorNumber() {
			
			return custmerNumber;
		}
		
		public int setPinNumber(int pinNumber) {
			this.pinNumber=pinNumber;
			return pinNumber;
		}
		public int getPinNumber() {
			return pinNumber;
			
		}
		
		public double getCheckingBalance() {
			return checkingBalnce;
		}
		public double getSavingBalance() {
			return savingBalance;
		}
		
	public double calcCheckingWithdraw(double amount) {
			checkingBalnce=(checkingBalnce-amount);
			return checkingBalnce;
		}
		
	public double calcSavingWithdraw(double amount) {
			savingBalance=(savingBalance-amount);
			return savingBalance;
		}
		
		
		public double calcCheckingDeposit(double amount) {
			checkingBalnce=(checkingBalnce+amount);
			return checkingBalnce;
		}
		public double calcSavingDeposit(double amount) {
			savingBalance=(savingBalance+amount);
			return savingBalance;
		}
		
	public void getsavingWithdrawInput() {
		System.out.println("saving Account Balance :"+moneyFormat.format(savingBalance));
		System.out.print("Amount you want to withdraw from saving Account:");
		double amount=input.nextDouble();
		if((savingBalance-amount)>=0){
			calcSavingWithdraw(amount);
			System.out.println("new saving account Balance :"+ moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be negatuive ");
		}
		
	}
	public void  getSavingDepositInput() {
		System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance));
		System.out.print("Amount you want to deposit from saving Account:");
		double amount=input.nextDouble();
		if((savingBalance+amount)>=0){
			calcSavingDeposit(amount);
			System.out.println("new saving account Balance :"+ moneyFormat.format(savingBalance));
		}
		else {
			System.out.println("Balance cannot be negatuive ");
		}
		
	}

		
		public void getCheckingWithdrawInput() {

			System.out.println("Cheching Account Balance:"+ moneyFormat.format(checkingBalnce));
			System.out.println("Amount you want to withdraw from checking Account:");
			double amount=input.nextDouble();
			if((checkingBalnce-amount)>=0) {
				calcCheckingWithdraw(amount);
				System.out.println("New checking Account Balnce :" + moneyFormat.format(checkingBalnce));
			}
			else {
				System.out.println("Balance Cannot be Negative." +"\n");
			}
		}
		public void getCheckingDepositInput() {
			System.out.println("Cheching Account Balance:"+ moneyFormat.format(checkingBalnce));
			System.out.println("Amount you want to deposit from checking Account:");
			double amount=input.nextDouble();
			if((checkingBalnce+amount)>=0) {
				calcCheckingDeposit(amount);
				System.out.println("New checking Account Balnce :" + moneyFormat.format(checkingBalnce));
			}
			else {
				System.out.println("Balance Cannot be Negative." +"\n");
			}
		}
		

	}
