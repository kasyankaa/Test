package ua.lviv.iot.pharmacy.model;
import ua.lviv.iot.pharmacy.model.Pack;
import ua.lviv.iot.pharmacy.model.Toxicity;
import ua.lviv.iot.pharmacy.model.AbstractMedicalProduct;
import ua.lviv.iot.pharmacy.model.DrugStore;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Pill extends AbstractMedicalProduct {
  @Transient
  private String structure;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "pack_id")
  @JsonIgnoreProperties("pills")
  private Pack pack;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "pill_stores", joinColumns = {
      @JoinColumn(name = "pill_id", nullable = false)},
  inverseJoinColumns = {@JoinColumn(name = "drug_store_id", nullable = false)})
  @JsonIgnoreProperties({"drugStores","pills"})
  private Set<DrugStore> drugStores;
  
  public Pack getPack() {
    return pack;
  }

  public void setPack(Pack pack) {
    this.pack = pack;
  }
  public Set<DrugStore> getDrugStores() {
    return drugStores;
  }

  public void setDrugStores(Set<DrugStore> drugStores) {
    this.drugStores = drugStores;
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

  @Transient
  public String getHeaders() {
    return super.getHeaders() + ", structure";
  }

  public String toCSV() {
    return super.toCSV() + "," + structure;
  }


}
