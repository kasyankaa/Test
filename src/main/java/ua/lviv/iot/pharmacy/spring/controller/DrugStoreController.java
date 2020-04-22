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

import ua.lviv.iot.pharmacy.business.DrugStoreService;
import ua.lviv.iot.pharmacy.model.DrugStore;

@RequestMapping("/drugStore")
@RestController
public class DrugStoreController {
  private AtomicInteger idCounter = new AtomicInteger();
  
  @Autowired
  private DrugStoreService drugStoreService;

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
  public DrugStore createDrugStore(@RequestBody DrugStore drugStore) {
    drugStore.setId(idCounter.incrementAndGet());
    return drugStoreService.createObject(drugStore);
  }

  @GetMapping
  public List<DrugStore> getAllDrugStores() {
    return drugStoreService.getAllObjects();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<DrugStore> getDrugStore(final @PathVariable("id") Integer id) {
    DrugStore currentDrugStore;
    ResponseEntity<DrugStore> response = (currentDrugStore = drugStoreService.getObject(id)) == null
        ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<>(currentDrugStore, HttpStatus.OK);
    return response;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<DrugStore> updateDrugStore(final @PathVariable("id") Integer id, final @RequestBody DrugStore drugStore) {
    drugStore.setId(id);
    DrugStore oldDrugStore = drugStoreService.updateObject(id, drugStore, new DrugStore());
    return oldDrugStore == null ? new ResponseEntity<DrugStore>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<DrugStore>(oldDrugStore, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<DrugStore> deleteDrugStore(@PathVariable("id") Integer id) {
    return drugStoreService.deleteObject(id) == null ? new ResponseEntity<DrugStore>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<DrugStore>(HttpStatus.OK);

  }
}

