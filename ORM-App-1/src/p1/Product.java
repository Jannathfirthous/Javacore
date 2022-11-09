package p1;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Id;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String ProductName;
	private int cost;
	private double rating;
	private String remarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Product(String ProductName, int cost, double rating, String remarks) {
		super();
		this.ProductName = ProductName;
		this.cost = cost;
		this.rating = rating;
		this.remarks = remarks;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
