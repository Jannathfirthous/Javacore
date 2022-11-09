package Bank;

import java.util.Arrays;
import java.util.List;

public class Database {
	public static List<Account> populateFromDatabase()
	{
		
		Account a1 = new Account("Ramesh",101,2600);
		
		Transaction a1t1 = new Transaction(200, "22/1/2022", "Deposit");
		Transaction a1t2 = new Transaction(1200, "22/1/2022", "ATM Widthrwal");
		Transaction a1t3 = new Transaction(400, "22/1/2022", "Fund Transfer");
		
		List<Transaction> allT1 = Arrays.asList(a1t1,a1t2,a1t3);
		a1.setAllTransactions(allT1);
		
		
		
		Account a2 = new Account("Suresh",102,12600);
		Transaction a2t1 = new Transaction(800, "22/1/2022", "Deposit");
		Transaction a2t2 = new Transaction(900, "22/1/2022", "ATM Widthrwal");
		Transaction a2t3 = new Transaction(700, "22/1/2022", "Fund Transfer");
		
		List<Transaction> allT2 = Arrays.asList(a1t1,a1t2,a1t3);
		a2.setAllTransactions(allT2);
		
		
		// add few more accounts like above
		
		
		
		List<Account> allAccounts = Arrays.asList(a1,a2);
		
		return allAccounts;
		
	}
}
