package ro.ase.cts.seminar10.chain;

public enum Verbosity {
INFO(1),
DEBUG(2),
ERROR(3);

	public int Verbosity;
	
	Verbosity(int i) {
		this.Verbosity=i;
	}

	public int getVerbosity() {
		return Verbosity;
	}
}
