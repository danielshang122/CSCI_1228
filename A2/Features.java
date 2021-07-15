package A2;

public class Features extends Surveyed {
	private String[] features;

	public Features() {
		this.features = new String[] { "None", "None" };
	}

	public Features(String community, int acreage, String[] features) {
		super(community, acreage);
		this.features = features;
	}

	public String[] getFeatures() {
		return features;
	}

	public void setFeatures(String[] features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Community: " + getCommunity() + "\nAcreage  : " +getAcreage() + "\n" + "Feature 1: " + features[0]
				+ "\nFeature 2: " + features[1]+"\n";
	}
}
