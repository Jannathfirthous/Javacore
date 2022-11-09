package Bank;

public class Transaction {
	private int amount;
	private String date;
	private String type; 
	public int getAmount() {
		return amount;
	}
	
	

	public Transaction(int amount, String date, String type) {
		super();
		this.amount = amount;
		this.date = date;
		this.type = type;
	}



	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
