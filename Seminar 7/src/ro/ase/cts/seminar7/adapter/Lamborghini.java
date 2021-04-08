package ro.ase.cts.seminar7.adapter;

public class Lamborghini extends EuropeanCar {

	public Lamborghini(String model) {
		super(model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		//in metric system
		return 320;
	}
}
