
public class Car {
	private int year;
	private String colour;

	public Car(int year, String colour) {
		this.year = year;
		this.colour = colour;
	}

	public Car() {
		this.year = 2022;
		this.colour = "black";
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

}
