package ua.lviv.iot.pharmacy.model;

public class Napkins extends AbstractEveryDayProduct {
	private int levelOfAbsorptionInDrops;

	public int getLevelOfAbsorptionInDrops() {
		return levelOfAbsorptionInDrops;
	}

	public void setLevelOfAbsorptionInDrops(int levelOfAbsorptionInDrops) {
		this.levelOfAbsorptionInDrops = levelOfAbsorptionInDrops;
	}

	public Napkins(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, int quantityInOnePackage,
			int levelOfAbsorptionInDrops) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, quantityInOnePackage);
		this.levelOfAbsorptionInDrops = levelOfAbsorptionInDrops;
	}

}
