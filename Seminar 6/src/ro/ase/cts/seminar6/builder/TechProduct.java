package ro.ase.cts.seminar6.builder;

public class TechProduct implements Product, Cloneable{
	
	int id;
	String productName;
	String manufactured;
	String model;
	String displayType;
	float price;
	
	private TechProduct() {
	}
	
	public TechProduct(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}

	public String getManufactured() {
		return manufactured;
	}

	public String getModel() {
		return model;
	}

	public String getDisplayType() {
		return displayType;
	}

	public float getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return this.productName+ " "+ this.manufactured +" "+this.model;
	}
	
	public static class TechProductBuilder{
		private TechProduct product;
		
		public TechProductBuilder(int id) {
			product=new TechProduct(id);
			
		}
		public TechProductBuilder setName(String name) {
			product.productName=name;
			return this;
		}
		
		public TechProductBuilder setManufacturer(String manufacturer) {
			product.manufactured=manufacturer;
			return this;
		}
		
		public TechProductBuilder setModel(String model) {
			product.model=model;
			return this;
		}
		
		public TechProductBuilder setDisplayType(String displayType) {
			product.displayType=displayType;
			return this;
		}
		
		public TechProductBuilder setPrice(float price) {
			product.price=price;
			return this;
		}
		
		public TechProduct getProduct() {
			return product;
		}
		
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		TechProduct newProduct = new TechProductBuilder(this.id)
				.setDisplayType(this.displayType)
				.setManufacturer(this.manufactured)
				.setModel(this.model)
				.setName(this.productName)
				.setPrice(this.price)
				.getProduct();
		return newProduct;
	}
	
	

}