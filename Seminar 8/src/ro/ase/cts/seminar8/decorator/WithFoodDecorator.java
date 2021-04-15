package ro.ase.cts.seminar8.decorator;

public class WithFoodDecorator extends AbstactBackPackDecorator{

	String food;
	
	public WithFoodDecorator(AbstractBackpack basicBackPack) {
		super(basicBackPack);
	}
	
	public WithFoodDecorator(AbstractBackpack basicBackpack, String food) {
		super(basicBackpack);
		this.food = food;
	}

	@Override
	public void pack() {
		this.basicBackpack.pack();
		System.out.print(" + "+this.food);
	}
	
	public String getFood() {
		return this.food;
	}

}
