package BuilderBook;

public class Book {
	private String mName;
	private String mAuthor;
	private double mPrice;
	private int mNumbers;
	private Genre mGenre;

	private Book(Builder builder) {
		mName = builder.mName;
		mAuthor = builder.mAuthor;
		mPrice = builder.mPrice;
		mNumbers = builder.mNumbers;
		mGenre = builder.mGenre;
	}

	/** 
	 * Print information of book
	 * */
	public void printBook() {
		System.out.println("Name: " + mName + ", " + "Author: " + mAuthor + ", " + "Price: " 
							+ mPrice + ", "	+ "Number: " + mNumbers + ", " + "Type Name: " 
							+ mGenre.getmNameType() + ", " + " Sale off: "	+ mGenre.isSaleOff());
	}

	/** Calculator price of book:
	 * NameType is Science && isSaleOff -> sale 15%
	 * NameType is Education && isSaleOff -> sale 50%
	 * NameType is Social && !isSaleOff -> sale 10%
	 * NameType is Social && isSaleOff -> sale 20%
	 * Default totalMoney = mNumbers * mPrice
	 * */
	public double totalMoney() {
		if (mGenre.getmNameType().equals("Science") && mGenre.isSaleOff()) {
			return mPrice * mNumbers * 15 / 100;
		}

		if (mGenre.getmNameType().equals("Education") && mGenre.isSaleOff()) {
			return mPrice * mNumbers * 50 / 100;
		}

		if (mGenre.getmNameType().equals("Social") && !mGenre.isSaleOff()) {
			return mPrice * mNumbers * 10 / 100;
		}

		if (mGenre.getmNameType().equals("Social") && mGenre.isSaleOff()) {
			return mPrice * mNumbers * 20 / 100;
		}

		return mPrice * mNumbers;
	}

	public static class Builder {
		private String mName;
		private String mAuthor;
		private double mPrice;
		private int mNumbers = 1;
		private Genre mGenre = new Genre("References", false);

		public Builder() {
			
		}
		
		public Builder(String name, double price) {
			this.mName = name;
			this.mPrice = price;
		}

		public Book build() {
			return new Book(this);
		}

		public Builder setmName(String mName) {
			this.mName = mName;
			return this;
		}

		public Builder setmAuthor(String mAuthor) {
			this.mAuthor = mAuthor;
			return this;
		}

		public Builder setmPrice(double mPrice) {
			this.mPrice = mPrice;
			return this;
		}

		public Builder setmNumbers(int mNumbers) {
			this.mNumbers = mNumbers;
			return this;
		}

		public Builder setmGenere(String name, boolean isSaleOff) {
			this.mGenre = new Genre(name, isSaleOff);
			return this;
		}
	}
}
