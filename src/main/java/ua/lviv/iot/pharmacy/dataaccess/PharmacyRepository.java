package ua.lviv.iot.pharmacy.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.pharmacy.model.Pill;
@Repository
public interface PharmacyRepository extends JpaRepository<Pill, Integer> {

}
