package ro.ase.cts.seminar2;

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
		//this.balance+=amount; daca balance era public 
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transfer(double amount, Account destination) {
		// TODO Auto-generated method stub
		
	}
	
	



}
