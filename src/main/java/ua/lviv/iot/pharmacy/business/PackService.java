package ua.lviv.iot.pharmacy.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.pharmacy.dataaccess.PackRepository;
import ua.lviv.iot.pharmacy.model.Pack;

@Service
public class PackService extends AbstractService<Pack> {
  @Autowired
  private PackRepository packRepository;
  @Override
  protected JpaRepository<Pack, Integer> getRepository() {
    return packRepository;
  }
}
