package BuilderBook;

public class Genre {
	private String mNameType;
	private boolean isSaleOff;

	public Genre() {
	}
	
	public Genre(String name, boolean isSale) {
		this.mNameType = name;
		this.isSaleOff = isSale;
	}

	public String getmNameType() {
		return mNameType;
	}

	public boolean isSaleOff() {
		return isSaleOff;
	}

	
}
