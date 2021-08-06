package A5;

public class Student extends Person implements Comparable<Student> {
	private String id;
	private double gpa;

	public Student(String firstName, String lastName, int age, String id, double gpa) {
		super(firstName, lastName, age);
		this.id = id;
		this.gpa = gpa;
	}

	public Student() {
		super();
		this.id = "A00000000";
		this.gpa = 0.0;
	}

	@Override
	public String toString() {
		return super.toString() + "ID: " + id + " GPA: " + gpa + "\n";
	}

	@Override
	public int compareTo(Student student) {
		int studentID = Integer.parseInt(student.id.substring(1));
		int thisID = Integer.parseInt(id.substring(1));
		return studentID > thisID ? -1 : 1;
	}

}
