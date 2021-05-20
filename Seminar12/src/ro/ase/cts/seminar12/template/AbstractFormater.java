package ro.ase.cts.seminar12.template;

public abstract class AbstractFormater {

	//template method
	public void displayOutput(int input) {
		int userInput=getInput(input);
		String formattefInput=formatInput(userInput);
		display(formattefInput);
	}
	
	//metode utilizate in implementare 
	protected int getInput(int fakeInput) {
		System.out.println("getting input from user");
		return fakeInput;
	}
	
	protected abstract String formatInput(int input);
	protected void display(String input) {
		System.out.println(input);
	}
}
