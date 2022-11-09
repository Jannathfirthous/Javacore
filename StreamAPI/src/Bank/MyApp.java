package Bank;

import java.util.*;
import java.util.stream.Stream;
public class MyApp {
	List<Account> accountDetails = Database.populateFromDatabase();
	public MyApp() {
		
	}
	
	public void printAccountTransactionById(int accountId)
	{
		List<Transaction> Tr = new ArrayList<>();
		accountDetails.stream()
			.filter((acc) -> acc.getAccountNumber() == accountId)
			.forEach((acc) -> acc.getAllTransactions().forEach((tr) -> Tr.add(tr)));
		System.out.println("Account Fetched Successfully!");
		accountDetails.stream()
			.filter((acc) -> acc.getAccountNumber() == accountId)
			.forEach(a -> printDetail(a));
		Tr.stream()
			.forEach((tr) -> printTransactions(tr.getAmount(), tr.getDate(), tr.getType()));
		
	}
	
	public void printAccount(String name, int AccountNumber, int Balance)
	{
		System.out.println("Name : " + name + "\n" + "Account Number : " + AccountNumber + "\n" + "Balance : " + Balance + printSep());
	}
	
	public void printTransactions(int amount, String Date, String Type)
	{
		
		System.out.println("Amount : " + amount + "\n" + "Date : " + Date + "\n" + "Type : " + Type + printSep());
	}
	
	public String printSep() {
		return "\n---------------------";
	}
	public void printDetail(Account acc) { 
		printAccount(acc.getName(), acc.getAccountNumber(), acc.getBalance());
		System.out.println("Transaction details of : "+acc.getName());
	}
	public void addInterest()
	{
		// write Stream API code to provide 4% interest to all accounts
		
		accountDetails.stream()
		.forEach(ad ->  {
			ad.setBalance(ad.getBalance() + (ad.getBalance()*4)/100);
		});
	}
}