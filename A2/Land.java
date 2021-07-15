package A2;

public class Land {
	private String community;

	public Land(String community) {
		this.setCommunity(community);
	}

	public Land() {
		this.setCommunity("HRM");
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	@Override
	public String toString() {
		return "Community: " + community+"\n";
	}
}
