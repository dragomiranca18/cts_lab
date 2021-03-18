package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.NotificationService;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class CurrentAccount extends BankAccount implements Depositable, Withdrawable, Transferable{

	public static double MAX_CREDIT=5000;
	public NotificationService notificationService;
	
	public CurrentAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(double balance, String iban) {
		super(balance, iban);
		//this.maxCredit=maxCredit;
	}

	
	
	public NotificationService getNotificationService() {
		return notificationService;
	}

	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
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
		if(this.notificationService !=null) {
		this.notificationService.sendNotification(" s-a extras suma "+amount);
		}
	}

	@Override
	public void transfer(double amount, Depositable destination) throws IllegalTransferException, InsufficientFundsException {
		if(((BankAccount)destination).iban.equals(this.iban)) {
			throw new IllegalTransferException("conturile coincid");
		}else
		{
			this.withdraw(amount);
			 destination.deposit(amount);
		}
		
	}
	
	



}
