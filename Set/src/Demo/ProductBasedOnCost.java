package Demo;

import java.util.Comparator;

public class ProductBasedOnCost implements Comparator<Product> {

	@Override
	public int compare(Product pp1, Product pp2) {
		return pp1.getCost() - pp2.getCost();
	}
}
