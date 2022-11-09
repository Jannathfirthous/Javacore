package Demo;

import java.time.LocalDate;

public class Product implements Comparable<Product> {
	String productName;
	String category;
	int cost;
	float rating;
	LocalDate dateOfManufacturing;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public LocalDate getDateOfManufacturing() {
		return dateOfManufacturing;
	}

	public void setDateOfManufacturing(LocalDate dateOfManufacturing) {
		this.dateOfManufacturing = dateOfManufacturing;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", category=" + category + ", cost=" + cost + ", rating="
				+ rating + ", dateOfManufacturing=" + dateOfManufacturing + "]";
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, String category, int cost, float rating, LocalDate dateOfManufacturing) {
		super();
		this.productName = productName;
		this.category = category;
		this.cost = cost;
		this.rating = rating;
		this.dateOfManufacturing = dateOfManufacturing;

	}

	@Override
	public int hashCode() {
		// return id+salary+name.length()+3;
		return cost + productName.length() + category.length();
	}

	@Override
	public boolean equals(Object obj) {

		/* code to inform java , how to compare two employees */

		// type cast obj to Employee type
		// System.out.println(" inside equals for employee :- "+id);

		if (obj instanceof Product) {
			// if its employee , then compare each property one by one

			Product pr2 = (Product) obj;

			boolean a = this.productName.equals(pr2.getProductName());
			boolean b = this.category.equals(pr2.getCategory());
			boolean c = this.cost == pr2.getCost();
			boolean d = this.rating == pr2.getRating();
			// boolean e=this.dateOfManufacturing== pr2.getDateOfManufacturing();

			return a && b && c && d;

		}

		/*
		 * else { return false; // in case if not employee , so not comprable }
		 */
		return super.equals(obj);

	}

	@Override
	public int compareTo(Product po) {

		return po.getCost() - this.cost;
	}

}
