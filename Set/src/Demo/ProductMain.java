package Demo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.List;
import java.util.ArrayList;

public class ProductMain {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		ProductMain pm = new ProductMain();

		Product p1 = new Product("Real me headphones", "Accessories", 500, 4.5f, LocalDate.of(2020, 12, 6));
		Product p2 = new Product("Real me headphones", "Accessories", 500, 3f, LocalDate.of(2020, 12, 6));
		Product p3 = new Product("boat smartWatch", "Accessories", 1000, 6f, LocalDate.of(2021, 9, 1));
		Product p4 = new Product("Dongles", "Accessories", 1850, 2f, LocalDate.of(2018, 2, 13));
		Product p5 = new Product("Samsung Tv", "Home Appliance", 10000, 10f, LocalDate.of(2016, 4, 23));
		Product p6 = new Product("Lipstick", "Makeup ", 1000, 6f, LocalDate.of(2021, 7, 21));
		Product p7 = new Product("Hair dryer", "Makeup ", 2000, 4.0f, LocalDate.of(2015, 10, 18));
		Product p8 = new Product("Sony Fridge", "Home Application", 1000, 5f, LocalDate.of(2020, 12, 6));
		Product p9 = new Product("eye liner", "Makeup ", 500, 7f, LocalDate.of(2022, 3, 6));
		Product p10 = new Product("RS Agarwal", "Study Material ", 900, 3f, LocalDate.of(2014, 3, 11));

		Set<Product> proSet = new TreeSet<>();
		proSet.add(p1);
		proSet.add(p2);
		proSet.add(p3);
		proSet.add(p4);
		proSet.add(p5);
		proSet.add(p6);
		proSet.add(p7);
		proSet.add(p8);
		proSet.add(p9);
		proSet.add(p10);

		pm.printSet(proSet);
		pm.printCollection(proSet, " Print Set based on Default");
		
		List<Product>  ProductBasedOnCost = new ArrayList<>(proSet);
		Collections.sort(ProductBasedOnCost , new ProductBasedOnCost());
		pm.printCollection(ProductBasedOnCost, "Print Set based on cost");
		
		List<Product> ProductBasedOnRating = new  ArrayList<>(proSet);
		Collections.sort(ProductBasedOnRating,new ProductBasedOnRating());
		pm.printCollection(ProductBasedOnRating, "Print Set based on Rating");
	}
	

	public void printSet(Set<Product> set) {
		for (Product p : set) {
			System.out.println(p);
		}

	}
	

	public void printCollection(Collection<Product> collection, String tagLine)
	{
		System.out.println(" \n\n ===============  "+tagLine+"   ==========================\n");
		for (Product po: collection) {
			System.out.println(po);
		}
	}
}
