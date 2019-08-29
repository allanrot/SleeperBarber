package prjSleeperBarber;

public final class Client {

	public static enum HairSize {BALD, SHORT, MEDIUM, LONG};
	public static enum BeardSize{NONE, SHORT, MEDIUM, LONG};
	
	private final HairSize hairSize;
	private final BeardSize beardSize;
	
	public Client(HairSize hairSize, BeardSize beardSize) {
		this.hairSize = hairSize;
		this.beardSize = beardSize;
	}

	public HairSize getHairSize() {
		return hairSize;
	}

	public BeardSize getBeardSize() {
		return beardSize;
	}
		
}
