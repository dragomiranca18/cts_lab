package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public abstract class Account {

	//e asbstracta deci nu va putea fi instantiata, va servi drept sablon
	
	public abstract double getBalance();
}
