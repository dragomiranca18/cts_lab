package ro.ase.cts.seminar8;

import ro.ase.cts.seminar8.composite.CatalogComponent;
import ro.ase.cts.seminar8.composite.Product;
import ro.ase.cts.seminar8.composite.ProductCatalog;
import ro.ase.cts.seminar8.decorator.AbstractBackpack;
import ro.ase.cts.seminar8.decorator.BackPack;
import ro.ase.cts.seminar8.decorator.WithFoodDecorator;
import ro.ase.cts.seminar8.decorator.WithLaptopDecorator;
import ro.ase.cts.seminar8.facade.OrderFacade;

public class Main {

	public static void main(String[] args) {
		System.out.println("-------------------Facade------------------------");
		OrderFacade facade=new OrderFacade();
		facade.Order();
		
		System.out.println("--------------------Composite------------------------------");
		
		CatalogComponent laptop=new Product("Asus", 2000);
		CatalogComponent smartphone=new Product("Samsung s20",3500);
		CatalogComponent techProductsCatalog=new ProductCatalog("Tech product");
		techProductsCatalog.add(laptop);
		techProductsCatalog.add(smartphone);
		
		CatalogComponent officeProductCatalog=new ProductCatalog("Office products");
		CatalogComponent paperclip=new Product("Paperclip", 5);
		CatalogComponent pen=new Product("Blue pen", 2);
		officeProductCatalog.add(pen);
		officeProductCatalog.add(paperclip);
		
		CatalogComponent genericProducts =new ProductCatalog("Generic products");
		genericProducts.add(new Product("Generic Product",0));
		genericProducts.add(techProductsCatalog);
		genericProducts.add(officeProductCatalog);
		
		System.out.println(genericProducts);
		
		System.out.println("--------------Decorator----------");
		AbstractBackpack myBackpack=new BackPack();
		myBackpack.pack();
		System.out.println("\n");
		AbstractBackpack decoratedBackPack= new WithLaptopDecorator(new WithFoodDecorator(myBackpack,"banana"));
		decoratedBackPack.pack();
	}

}
