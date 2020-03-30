package ua.lviv.iot.pharmacy.model;

public class Ointment extends AbstractMedicalProduct {

  private String excipients;

  public String getExcipients() {
    return excipients;
  }

  public void setExcipients(String excipients) {
    this.excipients = excipients;
  }

  public Ointment(int massinGrams, int shelfLifeInMonths,
            double priceInUAH, String nameOfProduct,
            String producingCountry, String compositionOfProduct,
            String sideEffects, boolean needOfDoctorsPrescription,
            String applicationMethod, String theraupeticEffect,
            Toxicity toxicityCategory, String excipients) {
    super(massinGrams, shelfLifeInMonths, priceInUAH,
                nameOfProduct, producingCountry, compositionOfProduct,
                sideEffects, needOfDoctorsPrescription, 
                applicationMethod, theraupeticEffect, toxicityCategory);
    this.excipients = excipients;
  }

	private String excipients;

	public String getExcipients() {
		return excipients;
	}

	public void setExcipients(String excipients) {
		this.excipients = excipients;
	}

	public Ointment(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, boolean needOfDoctorsPrescription,
			String applicationMethod, String theraupeticEffect, Toxicity toxicityCategory, String excipients) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, needOfDoctorsPrescription, applicationMethod, theraupeticEffect, toxicityCategory);
		this.excipients = excipients;
	}


}
