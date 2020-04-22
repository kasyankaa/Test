package ua.lviv.iot.pharmacy.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;

@MappedSuperclass
public abstract class AbstractPharmacyProduct {
  @Id
  @Column(name = "id")
  private Integer id;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Column(name = "mass")
  private int massInGrams;
  @Transient
  private int shelfLifeInMonths;
  @Column(name = "price")
  private double priceInUAH;
  @Column(name = "name")
  private String nameOfProduct;
  @Column(name = "country")
  private String producingCountry;
  @Transient
  private String compositionOfProduct;
  @Transient
  private String sideEffects;

  public int getMassInGrams() {
    return massInGrams;
  }

  public void setMassinGrams(int massinGrams) {
    this.massInGrams = massinGrams;
  }

  public int getShelfLifeInMonths() {
    return shelfLifeInMonths;
  }

  public void setShelfLifeInMonths(int shelfLifeInMonths) {
    this.shelfLifeInMonths = shelfLifeInMonths;
  }

  public double getPriceInUAH() {
    return priceInUAH;
  }

  public void setPriceInUAH(double priceInUAH) {
    this.priceInUAH = priceInUAH;
  }

  public String getNameOfProduct() {
    return nameOfProduct;
  }

  public void setNameOfProduct(String nameOfProduct) {
    this.nameOfProduct = nameOfProduct;
  }

  public String getProducingCountry() {
    return producingCountry;
  }

  public void setProducingCountry(String producingCountry) {
    this.producingCountry = producingCountry;
  }

  public String getCompositionOfProduct() {
    return compositionOfProduct;
  }

  public void setCompositionOfProduct(String compositionOfProduct) {
    this.compositionOfProduct = compositionOfProduct;
  }

  public String getSideEffects() {
    return sideEffects;
  }

  public void setSideEffects(String sideEffects) {
    this.sideEffects = sideEffects;
  }

  public AbstractPharmacyProduct() {
  }

  public AbstractPharmacyProduct(int massInGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
      String producingCountry, String compositionOfProduct, String sideEffects) {
    super();
    this.massInGrams = massInGrams;
    this.shelfLifeInMonths = shelfLifeInMonths;
    this.priceInUAH = priceInUAH;
    this.nameOfProduct = nameOfProduct;
    this.producingCountry = producingCountry;
    this.compositionOfProduct = compositionOfProduct;
    this.sideEffects = sideEffects;
  }

  @Transient
  public String getHeaders() {
    return "mass in grams, shelf life in months, price, name of product, producing country, composition of product, side effects";
  }

  public String toCSV() {
    return massInGrams + "," + shelfLifeInMonths + "," + priceInUAH + "," + nameOfProduct + "," + producingCountry + ","
        + compositionOfProduct + "," + sideEffects;
  }

}
