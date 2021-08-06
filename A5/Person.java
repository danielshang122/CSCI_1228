package A5;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Person() {
		this.firstName = "TBD";
		this.lastName = "TBD";
		this.age = 18;
	}

	@Override
	public String toString() {
		return "FIRST NAME: " + firstName + " LAST NAME: " + lastName + " AGE: " + age+"\n";
	}

}
