package ro.ase.cts.exemplu.adapter;

import ro.ase.cts.exemplu.factory.ContBancar;

public class AdapterCont implements BankAccount, ContBancar{

	private double total=500;
	
	@Override
	public void transfer(ContBancar destinatie, double suma) {
		if(total>=0)
			total-=suma;
		destinatie.depune(suma);
		System.out.println(suma + "de lei a fost adaugati in "+destinatie+ "->cont Credit");
	}
	
	@Override
	public void depune(double suma) {
		total+=suma;
		System.out.println(suma+" de lei a fost adaugati in contul curent ->Credit");
		
	}
	

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		this.transfer(this, amount);
	}

	@Override
	public String toString() {
		return "AdapterCont [total=" + total + "]";
	}
	
	

}
