package ua.lviv.iot.pharmacy.model;

public class Diapers extends AbstractEveryDayProduct {

  private int ageOfChildInMonths;

  public int getAgeOfChildInMonths() {
    return ageOfChildInMonths;
  }

  public void setAgeOfChildInMonths(int ageOfChildInMonths) {
    this.ageOfChildInMonths = ageOfChildInMonths;
  }

  public Diapers(int massinGrams, int shelfLifeInMonths, double priceInUAH, 
            String nameOfProduct,String producingCountry, String compositionOfProduct, 
            String sideEffects, int quantityInOnePackage,int ageOfChildInMonths) {
    super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, 
                producingCountry, compositionOfProduct,
                sideEffects, quantityInOnePackage);
    this.ageOfChildInMonths = ageOfChildInMonths;
  }

	private int ageOfChildInMonths;

	public int getAgeOfChildInMonths() {
		return ageOfChildInMonths;
	}

	public void setAgeOfChildInMonths(int ageOfChildInMonths) {
		this.ageOfChildInMonths = ageOfChildInMonths;
	}

	public Diapers(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, int quantityInOnePackage,
			int ageOfChildInMonths) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, quantityInOnePackage);
		this.ageOfChildInMonths = ageOfChildInMonths;
	}


}
