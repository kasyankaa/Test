package ua.lviv.iot.pharmacy.spring.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
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
import ua.lviv.iot.pharmacy.model.Pill;

@RequestMapping("/pills")
@RestController
public class PillController {
  private Map<Integer, Pill> products = new HashMap<>();
  private AtomicInteger idCounter = new AtomicInteger();

  @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
  public Pill createPill(@RequestBody Pill product) {
    product.setPillId(idCounter.incrementAndGet());
    products.put(product.getPillId(), product);
    return product;
  }

  @GetMapping(path = "/{id}")
  public Pill getPill(@PathVariable("id") Integer pillId) {
    System.out.println(pillId);
    return products.get(pillId);
  }

  @GetMapping
  public List<Pill> getAllPills() {
    return new LinkedList<Pill>(products.values());
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Pill> deletePill(@PathVariable("id") Integer pillId) {
    HttpStatus status = products.remove(pillId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
    return ResponseEntity.status(status).build();

  }

  @PutMapping(path = "/{id}")
  public ResponseEntity<Pill> updatePill(final @PathVariable("id") Integer pillId,
      final @RequestBody Pill product) {
    product.setPillId(pillId);
    Pill oldProduct= products.remove(product.getPillId());
    if (oldProduct != null) {
      products.put(product.getPillId(), product);
      return new ResponseEntity<Pill>(oldProduct, HttpStatus.OK);
    } else {
      return new ResponseEntity<Pill>(HttpStatus.NOT_FOUND);
    }
  }

}
