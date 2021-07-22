package A3;

public class Ticket implements Comparable<Ticket> {
	private String parcelID;
	private String shippingDate;

	public Ticket(String parcelID, String shippingDate) {
		this.parcelID = parcelID;
		this.shippingDate = shippingDate;
	}

	public Ticket() {
		this.parcelID = "AAA99";
		this.shippingDate = "31-12-2021";
	}

	public String getParcelID() {
		return parcelID;
	}

	public void setParcelID(String parcelID) {
		this.parcelID = parcelID;
	}

	public String getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(String shippingDate) {
		this.shippingDate = shippingDate;
	}

	@Override
	public String toString() {
		return "Parcel ID " + parcelID + " has or will be shipped " + shippingDate;
	}

	@Override
	public int compareTo(Ticket ticket) {
		String date = ticket.getShippingDate();
		String[] ticketSplitedDate = date.split("-");
		String[] thisSplitedDate = this.getShippingDate().split("-");
		if (Integer.parseInt(thisSplitedDate[2]) > Integer.parseInt(ticketSplitedDate[2])) {
			return 1;
		} else if (Integer.parseInt(thisSplitedDate[2]) < Integer.parseInt(ticketSplitedDate[2])) {
			return -1;
		} else {
			if (Integer.parseInt(thisSplitedDate[1]) > Integer.parseInt(ticketSplitedDate[1])) {
				return 1;
			} else if (Integer.parseInt(thisSplitedDate[1]) < Integer.parseInt(ticketSplitedDate[1])) {
				return -1;
			} else {
				if (Integer.parseInt(thisSplitedDate[0]) > Integer.parseInt(ticketSplitedDate[0])) {
					return 1;
				} else if (Integer.parseInt(thisSplitedDate[0]) < Integer.parseInt(ticketSplitedDate[0])) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}

}
