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

import ua.lviv.iot.pharmacy.business.PackService;
import ua.lviv.iot.pharmacy.model.Pack;

@RequestMapping("/packs")
@RestController
public class PackController {
  private AtomicInteger idCounter = new AtomicInteger();
  
  @Autowired
  private PackService packService;

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
  public Pack createPack(@RequestBody Pack pack) {
    pack.setId(idCounter.incrementAndGet());
    return packService.createObject(pack);
  }

  @GetMapping
  public List<Pack> getAllPacks() {
    return packService.getAllObjects();
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<Pack> getPack(final @PathVariable("id") Integer id) {
    Pack currentPack;
    ResponseEntity<Pack> response = (currentPack = packService.getObject(id)) == null
        ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<>(currentPack, HttpStatus.OK);
    return response;
  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Pack> updatePill(final @PathVariable("id") Integer id, final @RequestBody Pack pack) {
    pack.setId(id);
    Pack oldPack = packService.updateObject(id, pack, new Pack());
    return oldPack == null ? new ResponseEntity<Pack>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<Pack>(oldPack, HttpStatus.OK);
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Pack> deleteDrug(@PathVariable("id") Integer id) {
    return packService.deleteObject(id) == null ? new ResponseEntity<Pack>(HttpStatus.NOT_FOUND)
        : new ResponseEntity<Pack>(HttpStatus.OK);

  }
}
