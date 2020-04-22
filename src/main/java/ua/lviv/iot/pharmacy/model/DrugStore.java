package ua.lviv.iot.pharmacy.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class DrugStore{
  @Id
  private Integer id;
  private String nameOfOwner;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "pills", joinColumns = {
      @JoinColumn(name = "drug_store_id", nullable = false)},
  inverseJoinColumns = {@JoinColumn(name = "pill_id", nullable = false)})
  @JsonIgnoreProperties("pills")
  private Set<Pill> pills;

  public Integer getId() {
    return id;
  }

  public Set<Pill> getPills() {
    return pills;
  }

  public void setPills(Set<Pill> pills) {
    this.pills = pills;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public DrugStore() {

  }

  public String getNameOfOwner() {
    return nameOfOwner;
  }

  public void setNameOfOwner(String nameOfOwner) {
    this.nameOfOwner = nameOfOwner;
  }



  
}