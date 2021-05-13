package ro.ase.cts.exemplu.singleton;

import ro.ase.cts.exemplu.factory.ContBancar;
import ro.ase.cts.exemplu.factory.ContCredit;
import ro.ase.cts.exemplu.factory.ContDebit;

public class SingleBanca {

	private String denumire;
	private String adresa;
	public static int nrCont=0;
	
	private static SingleBanca INSTANCE;
	
	private SingleBanca(String denumire,String adresa) {
		this.denumire=denumire;
		this.adresa=adresa;
	}
	
	public static synchronized SingleBanca getInstance(String denumire, String adresa) {
		if(INSTANCE==null)
			INSTANCE=new SingleBanca(denumire, adresa);
		return INSTANCE;
	}
	
	public ContBancar createInstance(String tipCont) {
		ContBancar cont;
		switch(tipCont) {
		case "CREDIT":
			cont=new ContCredit();
			nrCont++;
		case "DEBIT":
			cont= new ContDebit();
			nrCont++;
			default:
				cont=null;
			break;
		}
		return cont;
	}
}
