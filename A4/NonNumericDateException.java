package A4;

public class NonNumericDateException extends A4Exceptions {
	private String input;

	public String getInput() {
		return input;
	}
	
	public NonNumericDateException(String input) {
		super();
		this.input=input;
	}
}
