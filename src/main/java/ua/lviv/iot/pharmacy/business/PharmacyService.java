package ua.lviv.iot.pharmacy.business;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.pharmacy.dataaccess.PharmacyRepository;
import ua.lviv.iot.pharmacy.model.Pill;

@Service
public class PharmacyService {
  @Autowired
  private PharmacyRepository pharmacyRepository;

  public Pill createPill(Pill pill) {
    return pharmacyRepository.save(pill);
  }
  public Pill getPill(Integer pillId) {
    return pharmacyRepository.findById(pillId).orElse(null);
  }

  public List<Pill> getAllPills() {
    return pharmacyRepository.findAll();
  }

  public Pill updatePill(Integer pillId, Pill pill) {
    Pill oldOption = null;
    Pill temporaryOption = pharmacyRepository.findById(pillId).orElse(null);
    if (temporaryOption != null) {
      oldOption = new Pill();
      BeanUtils.copyProperties(temporaryOption, oldOption);
      pharmacyRepository.save(pill);
    }
    return oldOption;
  }

  public Pill deletePill(Integer pillId) {
    Pill oldOption = pharmacyRepository.findById(pillId).orElse(null);
    if (oldOption != null) {
      pharmacyRepository.deleteById(pillId);
    }
    return oldOption;
  }

}
