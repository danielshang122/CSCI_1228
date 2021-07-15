package A2;

public class Surveyed extends Land {
	private int acreage;
	public Surveyed() {
		this.acreage=1;
	}
	public Surveyed(String community, int acreage) {
		super(community);
		this.acreage=acreage;
		
	}
	public int getAcreage() {
		return acreage;
	}
	public void setAcreage(int acreage) {
		this.acreage = acreage;
	}
	@Override
	public String toString() {
		return "Community: "+ getCommunity()+"\nAcreage  : "+acreage+"\n";
	}
}
