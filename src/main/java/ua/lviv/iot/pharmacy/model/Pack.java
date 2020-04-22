package ua.lviv.iot.pharmacy.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
public class Pack {
  @Id

  private Integer id;
  private String color;

  @OneToMany(mappedBy = "pack",fetch = FetchType.EAGER)
  @JsonIgnoreProperties({"pack","pills"})
 

  private Set<Pill> pills;
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
 
  public Set<Pill> getPills() {
    return pills;
  }
  public void setPills(Set<Pill> pills) {
    this.pills = pills;
  }
  public Pack(Integer id, String color) {
    super();
    this.id = id;
    this.color = color;
  }
  public Pack() {
    super();
  }

}
