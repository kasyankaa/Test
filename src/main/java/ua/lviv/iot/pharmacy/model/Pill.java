package ua.lviv.iot.pharmacy.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pill extends AbstractMedicalProduct {
  private String structure;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer pillId;
  
  public Integer getPillId() {
    return pillId;
  }

  public void setPillId(Integer pillId) {
    this.pillId = pillId;
  }  

  public String getStructure() {
    return structure;
  }

  public void setStructure(String structure) {
    this.structure = structure;
  }

  public Pill() {
    super();
  }

  public Pill(int massInGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct, String producingCountry,
      String compositionOfProduct, String sideEffects, boolean needOfDoctorsPrescription, String applicationMethod,
      String theraupeticEffect, Toxicity toxicityCategory, String structure) {
    super(massInGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
        sideEffects, needOfDoctorsPrescription, applicationMethod, theraupeticEffect, toxicityCategory);
    this.structure = structure;
  }

  public String getHeaders() {
    return super.getHeaders() + ", structure";
  }

  public String toCSV() {
    return super.toCSV() + "," + structure;
  }

}
