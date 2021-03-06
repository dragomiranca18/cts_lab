package ro.ase.cts.seminar10.chain;

public abstract class AbstractLogger {
	
	protected Verbosity level; 
	protected AbstractLogger nextLoger;
	
	public AbstractLogger(Verbosity verbositylevel) {
		this.level=verbositylevel;
	}
	
	public void setNextLogger(AbstractLogger logger) {
		this.nextLoger=logger;
	}
	
	public void logMessage(Verbosity level, String message) {
		if(this.level.getVerbosity() <= level.getVerbosity()) {
			write(message);
		}
		if(nextLoger != null) {
			nextLoger.logMessage(level, message);
		}
	}
	
	abstract void write(String message);
}
