package ro.ase.cts.seminar2;

import ro.ase.cts.seminar2.exceptii.IllegalTransferException;
import ro.ase.cts.seminar2.exceptii.InsufficientFundsException;
import ro.ase.cts.seminar2.interfaces.Depositable;
import ro.ase.cts.seminar2.interfaces.NotificationService;
import ro.ase.cts.seminar2.interfaces.Profitable;
import ro.ase.cts.seminar2.interfaces.Transferable;
import ro.ase.cts.seminar2.interfaces.Withdrawable;

public class Main {

	public static void main(String[] args)  {
		CurrentAccount c=new CurrentAccount(300,"IBAN1");
		c.setNotificationService(new SMSNotificationService());
		CurrentAccount account2=new CurrentAccount(200,"IBAN2");
		
		SavingsAccount account3=new SavingsAccount(300,"IBAN3");
		
		System.out.println("suma disponibila este: "+c.getBalance());
		System.out.println("creditul maxim pentru cont curent este "+CurrentAccount.MAX_CREDIT);
		
		c.deposit(200);
		
		System.out.println("suma disponibila este: "+c.getBalance());
		
		try {
			c.withdraw(200);
			c.setNotificationService(new EmailNotificationService());
			c.withdraw(200);
			c.setNotificationService(new NotificationService() {
			
				@Override
				public void sendNotification(String message) {
					System.out.println("Sent email notification with message:" + message);
				}
			});
			
			c.transfer(100,c);
		} catch (InsufficientFundsException | IllegalTransferException e) {
			System.err.println(e.getMessage());
		} 
		
		System.out.println("suma disponibila este: "+ c.getBalance());
		System.out.println("suma in contul 2 este: "+ account2.getBalance());
		System.out.println("suma in contul 3 este: "+ account3.getBalance());
		account3.addInterest(10);
		System.out.println("suma in contul 3 este: "+ account3.getBalance());
	
		account3.deposit(200);
	
		Bank banca=new Bank();
		BankAccount account4=banca.openBankAccount(AccountType.CURRENT);
	}

	
}
