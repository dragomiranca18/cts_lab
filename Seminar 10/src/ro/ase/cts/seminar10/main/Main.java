package ro.ase.cts.seminar10.main;

import ro.ase.cts.seminar10.strategy.MarketingStrategyInterface;
import ro.ase.cts.seminar10.strategy.ModulMarketing;
import ro.ase.cts.seminar10.strategy.RandomMarketingStrategy;

public class Main {

	public static void main(String[] args)  {
	ModulMarketing modulMarketing=new ModulMarketing();
	modulMarketing.setCurentStrategy(new RandomMarketingStrategy());
	double puncteBonus=modulMarketing.getBonus(100);
	System.out.println("Numar puncte bonus "+ puncteBonus);
	
	modulMarketing.setCurentStrategy(new MarketingStrategyInterface() {
		
		@Override
		public double calculateBonus(double base) {
			return 30*base;
		}
	});
	
	puncteBonus=modulMarketing.getBonus(100);
	System.out.println("Numar puncte bonus "+ puncteBonus);
	
	modulMarketing.setCurentStrategy((base)->{return 20*base;});
	puncteBonus=modulMarketing.getBonus(100);
	System.out.println("Numar puncte bonus "+ puncteBonus);
	}

}