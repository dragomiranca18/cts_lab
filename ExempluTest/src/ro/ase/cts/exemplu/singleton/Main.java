package ro.ase.cts.exemplu.singleton;

import ro.ase.cts.exemplu.adapter.AdapterCont;
import ro.ase.cts.exemplu.adapter.BankAccount;
import ro.ase.cts.exemplu.factory.ContBancar;

public class Main {

	public static void main(String[] args) {
		SingleBanca singleBanca=SingleBanca.getInstance("BCR", "Centru");
		ContBancar cont1=singleBanca.createInstance("CREDIT");
		ContBancar cont2=singleBanca.createInstance("DEBIT");
		
		ContBancar adapterCont=new AdapterCont();
		System.out.println(SingleBanca.nrCont);
		
		BankAccount bankAccount=new AdapterCont();
		System.out.println(adapterCont);
		
		adapterCont.transfer(cont1, 200);
		System.out.println(adapterCont);
		
		adapterCont.depune(500);
		System.out.println(adapterCont);
		
		((BankAccount)adapterCont).accountTransfer(bankAccount, 200);
		System.out.println(adapterCont);
	}

}
