
public class Lot {
	private static int carLotNumber;
	private Car[] subCompacts;
	private Car[] compacts;
	private Car[] other;

	public Lot(Car[] subCompacts, Car[] compacts, Car[] other) {
		carLotNumber++;
		this.subCompacts = subCompacts;
		this.compacts = compacts;
		this.other = other;
	}

	public Lot() {
		carLotNumber++;
		this.subCompacts = new Car[] { new Car(2022, "black") };
		this.compacts = new Car[] { new Car(2022, "black") };
		this.other = new Car[] { new Car(2022, "black") };
	}

	public Car[] getSubCompacts() {
		return subCompacts;
	}

	public void setSubCompacts(Car[] subCompacts) {
		this.subCompacts = subCompacts;
	}

	public Car[] getCompacts() {
		return compacts;
	}

	public void setCompacts(Car[] compacts) {
		this.compacts = compacts;
	}

	public Car[] getOther() {
		return other;
	}

	public void setOther(Car[] other) {
		this.other = other;
	}

	public int oldestCarOnLot() {
		Car oldestCar = new Car();
		int year = 2022;
		for (Car car : compacts) {
			if (car.getYear() < year) {
				year=car.getYear();
				oldestCar = car;
			}
		}
		for (Car car : subCompacts) {
			if (car.getYear() < year) {
				year=car.getYear();
				oldestCar = car;
			}
		}
		for (Car car : other) {
			if (car.getYear() < year) {
				year=car.getYear();
				oldestCar = car;
			}
		}

		return oldestCar.getYear();
	}

	public boolean equals(Lot lot) {
		if (this.subCompacts.length == lot.getSubCompacts().length && this.compacts.length == lot.getCompacts().length
				&& this.other.length == lot.getOther().length) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Car Lot#" + carLotNumber + "\n");
		str.append("Sub-Compact Cars:\n");
		for (Car car : subCompacts) {
			str.append("Year: " + car.getYear() + "\tColour: " + car.getColour() + "\n");
		}
		str.append("Compact Cars:\n");
		for (Car car : compacts) {
			str.append("Year: " + car.getYear() + "\tColour: " + car.getColour() + "\n");
		}
		str.append("Other Cars:\n");
		for (Car car : other) {
			str.append("Year: " + car.getYear() + "\tColour: " + car.getColour() + "\n");
		}

		return str.toString();
	}
}
