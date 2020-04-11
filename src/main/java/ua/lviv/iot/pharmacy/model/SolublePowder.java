package ua.lviv.iot.pharmacy.model;

public class SolublePowder extends AbstractMedicalProduct {
  private String solubility;

  public String getSolubility() {
    return solubility;
  }

  public void setSolubility(String solubility) {
    this.solubility = solubility;
  }

  public SolublePowder(int massInGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
      String producingCountry, String compositionOfProduct, String sideEffects, boolean needOfDoctorsPrescription,
      String applicationMethod, String theraupeticEffect, Toxicity toxicityCategory, String solubility) {
    super(massInGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
        sideEffects, needOfDoctorsPrescription, applicationMethod, theraupeticEffect, toxicityCategory);
    this.solubility = solubility;
  }

  public String getHeaders() {
    return super.getHeaders() + ", solubility";
  }

  public String toCSV() {
    return super.toCSV() + "," + solubility;
  }

}
