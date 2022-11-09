package Bank;

import java.util.*;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int accountId;
		MyApp app = new MyApp();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		accountId = sc.nextInt();
		app.addInterest();
		app.printAccountTransactionById(accountId);
	}
}
