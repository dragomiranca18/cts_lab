package ro.ase.cts.seminar10.chain;

public class ErrorLogger extends AbstractLogger {

	public ErrorLogger(Verbosity verbositylevel) {
		super(verbositylevel);
	}

	@Override
	void write(String message) {
		System.err.println(ErrorLogger.class.getName()+ " : " + message);
	}

}
