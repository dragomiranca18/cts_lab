package ro.ase.cts.seminar8.decorator;

public abstract class AbstactBackPackDecorator extends AbstractBackpack{
	protected AbstractBackpack basicBackpack;

	public AbstactBackPackDecorator(AbstractBackpack basicBackpack) {
		super();
		this.basicBackpack = basicBackpack;
	}
	
}
