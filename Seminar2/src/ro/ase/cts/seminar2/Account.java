package ro.ase.cts.seminar2;

public abstract class Account {

	//e asbstracta deci nu va putea fi instantiata, va servi drept sablon
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract void transfer(double amount,Account destination);
	public abstract double getBalance();
}
