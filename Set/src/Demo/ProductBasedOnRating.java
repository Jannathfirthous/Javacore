package Demo;

import java.util.Comparator;

public class ProductBasedOnRating implements Comparator<Product> {
	@Override
	public int compare(Product pp1, Product pp2) {
		return (int) (pp1.getRating() - pp2.getRating());
	}

}
