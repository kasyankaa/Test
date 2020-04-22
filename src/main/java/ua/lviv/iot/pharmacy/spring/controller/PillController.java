package ua.lviv.iot.pharmacy.spring.controller;

import java.util.List;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.pharmacy.business.PharmacyService;
import ua.lviv.iot.pharmacy.model.Pill;

@RequestMapping("/pills")
@RestController
public class PillController {
  private AtomicInteger idCounter = new AtomicInteger();
  
  @Autowired
  private PharmacyService pharmacyService;

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
  public Pill createDrug(@RequestBody Pill pill) {
    pill.setId(idCounter.incrementAndGet());
    return pharmacyService.createObject(pill);
  }

  @GetMapping
  public List<Pill> getAllPharmacies() {
    return pharmacyService.getAllObjects();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Pill> getPill(final @PathVariable("id") Integer id) {
    Pill currentPill;
    ResponseEntity<Pill> response = (currentPill = pharmacyService.getObject(id)) == null
        ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<>(currentPill, HttpStatus.OK);
    return response;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Pill> updatePill(final @PathVariable("id") Integer id, final @RequestBody Pill pill) {
    pill.setId(id);
    Pill oldPill = pharmacyService.updateObject(id, pill, new Pill());
    return oldPill == null ? new ResponseEntity<Pill>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<Pill>(oldPill, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Pill> deleteDrug(@PathVariable("id") Integer id) {
    return pharmacyService.deleteObject(id) == null ? new ResponseEntity<Pill>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<Pill>(HttpStatus.OK);

  }
}
