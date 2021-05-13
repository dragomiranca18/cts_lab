package ro.ase.cts.exemplu.factory;

public interface ContBancar {

	public void transfer(ContBancar destinatie, double suma);
	public void depune(double suma);
	
}
