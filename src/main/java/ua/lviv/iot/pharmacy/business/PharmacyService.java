package ua.lviv.iot.pharmacy.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.pharmacy.dataaccess.PharmacyRepository;
import ua.lviv.iot.pharmacy.model.Pill;

@Service
public class PharmacyService extends AbstractService<Pill>{
  @Autowired
  private PharmacyRepository pharmacyRepository;
  @Override
  protected JpaRepository<Pill, Integer> getRepository() {
    return pharmacyRepository;
  }
}
