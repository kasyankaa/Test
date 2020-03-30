package ua.lviv.iot.pharmacy.model;

public abstract class AbstractEveryDayProduct extends AbstractPharmacyProduct {

  private int quantityInOnePackage;

  public int getQuantityInOnePackage() {
    return quantityInOnePackage;
  }

  public void setQuantityInOnePackage(int quantityInOnePackage) {
    this.quantityInOnePackage = quantityInOnePackage;
  }

  public AbstractEveryDayProduct(int massinGrams, int shelfLifeInMonths,
            double priceInUAH, String nameOfProduct,
            String producingCountry, String compositionOfProduct, 
            String sideEffects, int quantityInOnePackage) {
    super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, 
                producingCountry, compositionOfProduct,sideEffects);
    this.quantityInOnePackage = quantityInOnePackage;
  }
	private int quantityInOnePackage;

	public int getQuantityInOnePackage() {
		return quantityInOnePackage;
	}

	public void setQuantityInOnePackage(int quantityInOnePackage) {
		this.quantityInOnePackage = quantityInOnePackage;
	}

	public AbstractEveryDayProduct(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, int quantityInOnePackage) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects);
		this.quantityInOnePackage = quantityInOnePackage;
	}
}
