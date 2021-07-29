package A4;

import java.util.Scanner;

public class A4Driver {
	public static final int DATE_LENGTH = 10;
	public static final String SEPARATOR = "/";
	public static String input;

	public static void main(String[] args) {
		System.out.println("You entered " + getDate());
	}

	private static String getDate() {
		System.out.print("Please enter a shipping date (format: DD/MM/YYYY): ");
		Scanner UserInput = new Scanner(System.in);
		input = UserInput.nextLine();
        check(input);
		UserInput.close();
		return input;
	}

	private static void check(String input){
		try {
			checkDateLength(input);
		} catch (DateLengthException e) {
			System.out.println("Too many characters were entered for the date.");
			getDate();
		}

		try {
			checkNumeric(input);
		} catch (NonNumericDateException e) {
			System.out.println("For input string: \"" + e.getInput() + "\"");
			System.out.println("The day, month or year is non numeric.");
			getDate();
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Input data is too short");
			getDate();
		}

		try {
			checkSeparator(input);
		} catch (SeparatorException e) {
			System.out.println("An invalid separator was used in the date.");
			getDate();
		}
	}

	private static void checkDateLength(String input) throws DateLengthException {
		if (input.length() > DATE_LENGTH) {
			throw new DateLengthException();
		}
	}

	private static void checkNumeric(String input) throws NonNumericDateException {
		if(input.length()<DATE_LENGTH) {
			throw new StringIndexOutOfBoundsException();
		}
		String[] inputSplited = new String[3];
		inputSplited[0] = input.substring(0, 2);
		inputSplited[1] = input.substring(3, 5);
		inputSplited[2] = input.substring(6, DATE_LENGTH);
		for (String string : inputSplited) {
			try {
				Integer.parseInt(string);
			} catch (NumberFormatException e) {
				throw new NonNumericDateException(string);
			}
		}
	}

	private static void checkSeparator(String input) throws SeparatorException {
		if (!input.substring(2).startsWith(SEPARATOR) || !input.substring(5).startsWith(SEPARATOR)) {
			throw new SeparatorException();
		}
	}

}
