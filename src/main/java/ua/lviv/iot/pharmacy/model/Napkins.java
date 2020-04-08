package ua.lviv.iot.pharmacy.model;

public class Napkins extends AbstractEveryDayProduct {
  private int levelOfAbsorptionInDrops;

  public int getLevelOfAbsorptionInDrops() {
    return levelOfAbsorptionInDrops;
  }

  public void setLevelOfAbsorptionInDrops(int levelOfAbsorptionInDrops) {
    this.levelOfAbsorptionInDrops = levelOfAbsorptionInDrops;
  }

  public Napkins(int massInGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
      String producingCountry, String compositionOfProduct, String sideEffects, int quantityInOnePackage,
      int levelOfAbsorptionInDrops) {
    super(massInGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
        sideEffects, quantityInOnePackage);
    this.levelOfAbsorptionInDrops = levelOfAbsorptionInDrops;
  }

  public String getHeaders() {
    return super.getHeaders() + ", level of Absorption";
  }

  public String toCSV() {
    return super.toCSV() + "," + levelOfAbsorptionInDrops;
  }

}
