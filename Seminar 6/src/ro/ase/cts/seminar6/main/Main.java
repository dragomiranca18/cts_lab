package ro.ase.cts.seminar6.main;

import java.util.Scanner;

import ro.ase.cts.seminar6.builder.AbstractProductFactory;
import ro.ase.cts.seminar6.builder.Product;
import ro.ase.cts.seminar6.builder.TechProductFactory;
import ro.ase.cts.seminar6.singleton.Cart;

public class Main {

	public static void main(String[] args) {
	Cart myShoppingCart=Cart.getInstance("shopping");
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Selectati categotia de produse: \ntech - Produse tech \n office - Produse office");
	String userPreferences=scan.nextLine();
	Product myProduct=null;
	
	AbstractProductFactory productFactory=null;
	
	if(userPreferences!=null) {
		if(userPreferences.equalsIgnoreCase("tech")) {
			productFactory=new TechProductFactory();
		}
	}
	
	System.out.println(productFactory.getCatalog());
	userPreferences=scan.nextLine();
	try {
		int selectedID = Integer.valueOf(userPreferences);
		myProduct = productFactory.makeProduct(selectedID);
	} catch (NumberFormatException e) {
		System.err.println("Selectie invalida");
	}
	
	if(myProduct!=null) {
		myShoppingCart.products.add(myProduct);
	}
	
	
	for(Product p: myShoppingCart.products) {
		System.out.println(p.getDescription());
	}
	}

}
