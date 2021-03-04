package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;

public class CurrentAccount extends BankAccount{

	public static double MAX_CREDIT=5000;
	public double maxCredit;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
		//this.maxCredit=maxCredit;
	}

	@Override
	public void deposit(double amount) {
		this.setBalance(getBalance()+amount);
		//this.balance+=amount; daca balance era protected 
		
	}

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		// ar trebui sa scada suma primita ca param
		if(this.balance>=amount) {
			this.balance-=amount;
		}else {
			throw new InsufficientFundsException("fonduri insuficiente");
		}
	}

	@Override
	public void transfer(double amount, Account destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}else
		{
			this.withdraw(amount);
			destination.deposit(amount);
		}
		
	}
	
	



}
