package ua.lviv.iot.pharmacy.model;

public abstract class AbstractMedicalProduct extends AbstractPharmacyProduct {

  private boolean needOfDoctorsPrescription;
  private String applicationMethod;
  private String theraupeticEffect;
  private Toxicity toxicityCategory;

  public boolean isNeedOfDoctorsPrescription() {
    return needOfDoctorsPrescription;
  }

  public void setNeedOfDoctorsPrescription(boolean needOfDoctorsPrescription) {
    this.needOfDoctorsPrescription = needOfDoctorsPrescription;
  }

  public String getApplicationMethod() {
    return applicationMethod;
  }

  public void setApplicationMethod(String applicationMethod) {
    this.applicationMethod = applicationMethod;
  }

  public String getTheraupeticEffect() {
    return theraupeticEffect;
  }

  public void setTheraupeticEffect(String theraupeticEffect) {
    this.theraupeticEffect = theraupeticEffect;
  }

  public Toxicity getToxicityCategory() {
    return toxicityCategory;
  }

  public void setToxicityCategory(Toxicity toxicityCategory) {
    this.toxicityCategory = toxicityCategory;
  }

  public AbstractMedicalProduct(int massinGrams, int shelfLifeInMonths,
            double priceInUAH, String nameOfProduct,
            String producingCountry, String compositionOfProduct,
            String sideEffects, boolean needOfDoctorsPrescription,
            String applicationMethod, String theraupeticEffect, Toxicity toxicityCategory) {
    super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct,
                producingCountry, compositionOfProduct,sideEffects);
    this.needOfDoctorsPrescription = needOfDoctorsPrescription;
    this.applicationMethod = applicationMethod;
    this.theraupeticEffect = theraupeticEffect;
    this.toxicityCategory = toxicityCategory;
  }

	private boolean needOfDoctorsPrescription;
	private String applicationMethod;
	private String theraupeticEffect;
	private Toxicity toxicityCategory;

	public boolean isNeedOfDoctorsPrescription() {
		return needOfDoctorsPrescription;
	}

	public void setNeedOfDoctorsPrescription(boolean needOfDoctorsPrescription) {
		this.needOfDoctorsPrescription = needOfDoctorsPrescription;
	}

	public String getApplicationMethod() {
		return applicationMethod;
	}

	public void setApplicationMethod(String applicationMethod) {
		this.applicationMethod = applicationMethod;
	}

	public String getTheraupeticEffect() {
		return theraupeticEffect;
	}

	public void setTheraupeticEffect(String theraupeticEffect) {
		this.theraupeticEffect = theraupeticEffect;
	}

	public Toxicity getToxicityCategory() {
		return toxicityCategory;
	}

	public void setToxicityCategory(Toxicity toxicityCategory) {
		this.toxicityCategory = toxicityCategory;
	}

	public AbstractMedicalProduct(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, boolean needOfDoctorsPrescription,
			String applicationMethod, String theraupeticEffect, Toxicity toxicityCategory) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects);
		this.needOfDoctorsPrescription = needOfDoctorsPrescription;
		this.applicationMethod = applicationMethod;
		this.theraupeticEffect = theraupeticEffect;
		this.toxicityCategory = toxicityCategory;
	}


}
