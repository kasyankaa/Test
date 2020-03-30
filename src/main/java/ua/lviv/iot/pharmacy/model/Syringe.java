package ua.lviv.iot.pharmacy.model;

public class Syringe extends AbstractEveryDayProduct {
	private int capacityInMl;
	private int lengthOfNeedleInCm;

	public int getCapacityInMl() {
		return capacityInMl;
	}

	public void setCapacityInMl(int capacityInMl) {
		this.capacityInMl = capacityInMl;
	}

	public int getLengthOfNeedleInCm() {
		return lengthOfNeedleInCm;
	}

	public void setLengthOfNeedleInCm(int lengthOfNeedleInCm) {
		this.lengthOfNeedleInCm = lengthOfNeedleInCm;
	}

	public Syringe(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, int quantityInOnePackage,
			int capacityInMl, int lengthOfNeedleInCm) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, quantityInOnePackage);
		this.capacityInMl = capacityInMl;
		this.lengthOfNeedleInCm = lengthOfNeedleInCm;
	}

}
