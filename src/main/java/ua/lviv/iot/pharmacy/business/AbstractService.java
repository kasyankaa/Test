package ua.lviv.iot.pharmacy.business;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<SomeObject> {

  protected abstract JpaRepository<SomeObject, Integer> getRepository();
  
  public SomeObject createObject(SomeObject object) {
    return this.getRepository().save(object);
  }

  public SomeObject getObject(Integer objectID) {
    return this.getRepository().findById(objectID).orElse(null);
  }

  public List<SomeObject> getAllObjects() {
    return this.getRepository().findAll();
  }

  public SomeObject updateObject(Integer objectID, SomeObject object, SomeObject oldObject) {
    SomeObject temporaryObject = this.getRepository().findById(objectID).orElse(null);
    if (temporaryObject != null) {
      BeanUtils.copyProperties(temporaryObject, oldObject);
      this.getRepository().save(object);
    }
    return oldObject;
  }

  public SomeObject deleteObject(Integer objectID) {
    SomeObject oldObject = this.getRepository().findById(objectID).orElse(null);
    if (oldObject != null) {
      this.getRepository().deleteById(objectID);
    }
    return oldObject;
  }

}

