package day2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class UserInteraction {
	ServerCode server = new ServerCode();
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
UserInteraction bankingApp = new UserInteraction();
		
		bankingApp.viewAllBalance();
		bankingApp.initiateFundTransfer(); // bank executive
		bankingApp.viewAllBalance();
		bankingApp.printAccountBasedOnBalance();
		bankingApp.checkBalance();
	}
	public void viewAllBalance() {
		
		int allData[] = server.getAllAccountArray();
		
		System.out.println("\nAcc.no \t Balance\n=====================\n");
		for(int x = 0; x< allData.length ; x++)
		{
			System.out.println(x+" \t- "+allData[x]);
		}
	}
	
	public void initiateFundTransfer()
	{
		// need to take user input
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Ower Id [0-5]");
		int accountHolderId = sc.nextInt();
		
		System.out.println("Enter Payee Id [0-5]");
		int payeeId = sc.nextInt();
		
		System.out.println("Enter Amount to be transfered :- ");
		int amount = sc.nextInt();
		
		
		
		boolean statusNotification = server.transferFunds(accountHolderId, payeeId, amount);
		
		if(statusNotification)
		{
			System.out.println("Fund Transfer Done Rs."+amount+" Date/Time :- "+LocalDateTime.now());
		}
		else
		{
			System.out.println(" Fund transfer deny , reason low balance or connect to support@abc.com");
		}

	}
	
	public void printAccountBasedOnBalance()
	{
		// print account based on two balance range 
		System.out.println("Enter a range1");
		int r1=sc.nextInt();
		System.out.println("Enter a range2");
		int r2=sc.nextInt();
		for(int i=0;i<6;i++)
		{
			if((server.allAccountBalance[i]>=r1)&&server.allAccountBalance[i]<=r2) 
			{
				System.out.println(server.allAccountBalance[i]);
			}
		}
		
	}
	
	public void checkBalance()
	{
		/* user like to view balance*/
		
		System.out.println("Please enter the account number(0-5) ");
		int n=sc.nextInt();
		int balance=server.getBalance(n);
		System.out.println("Balance of your account = "+balance);
	}
	
	
}
