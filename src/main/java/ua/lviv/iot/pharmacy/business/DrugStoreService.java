package ua.lviv.iot.pharmacy.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import ua.lviv.iot.pharmacy.dataaccess.DrugStoreRepository;
import ua.lviv.iot.pharmacy.model.DrugStore;

@Service
public class DrugStoreService extends AbstractService<DrugStore> {
  @Autowired
  private DrugStoreRepository drugStoreRepository;
  @Override
  protected JpaRepository<DrugStore, Integer> getRepository(){
    return drugStoreRepository;
  }
}
