package ro.ase.cts.seminar5.factory;

public class TechProduct implements Product{

	String productName;
	String manufacturer;
	String model;
	String displayType;
	float price;
	
	private TechProduct() {
		
	}
	
	public TechProduct(String productName) {
		super();
		this.productName=productName;
	}
	
	@Override
	public String getDescription() {
		return "this is a tech product";
	}

}
