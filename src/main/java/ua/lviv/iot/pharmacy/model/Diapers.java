package ua.lviv.iot.pharmacy.model;

public class Diapers extends AbstractEveryDayProduct {
	private int ageOfChildInMonths;

	public int getAgeOfChildInMonths() {
		return ageOfChildInMonths;
	}

	public void setAgeOfChildInMonths(int ageOfChildInMonths) {
		this.ageOfChildInMonths = ageOfChildInMonths;
	}

	public Diapers(int massInGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, int quantityInOnePackage,
			int ageOfChildInMonths) {
		super(massInGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, quantityInOnePackage);
		this.ageOfChildInMonths = ageOfChildInMonths;
	}

	public String getHeaders() {
		return super.getHeaders() + ", age of child in months";
	}

	public String toCSV() {
		return super.toCSV() + "," + ageOfChildInMonths;
	}

}
