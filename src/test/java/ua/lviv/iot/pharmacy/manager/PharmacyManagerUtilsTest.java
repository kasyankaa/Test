package ua.lviv.iot.pharmacy.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.pharmacy.model.*;

public class PharmacyManagerUtilsTest extends BasePharmacyManagerTest {
  @BeforeEach
  void setUp() throws Exception {
    createPharmacies();
  }

  @Test
  public void testSortingDescending() {
    PharmacyManagerUtils.sortByMassInGrams(pills, SortType.DESCENDING);
    assertEquals(9, pills.get(0).getMassInGrams());
    assertEquals(6, pills.get(1).getMassInGrams());
    assertEquals(3, pills.get(2).getMassInGrams());
    PharmacyManagerUtils.sortByPrice(pills, SortType.DESCENDING);
    assertEquals(450, pills.get(0).getPriceInUAH());
    assertEquals(120, pills.get(1).getPriceInUAH());
    assertEquals(60, pills.get(2).getPriceInUAH());
    PharmacyManagerUtils.sortByShelfLifeInMonths(pills, SortType.DESCENDING);
    assertEquals(36, pills.get(0).getShelfLifeInMonths());
    assertEquals(24, pills.get(1).getShelfLifeInMonths());
    assertEquals(12, pills.get(2).getShelfLifeInMonths());
    PharmacyManagerUtils.sortByNameOfProduct(pills, SortType.DESCENDING);
    assertEquals("Tritico", pills.get(0).getNameOfProduct());
    assertEquals("Noshpa", pills.get(1).getNameOfProduct());
    assertEquals("Glicyset", pills.get(2).getNameOfProduct());
  }

  @Test
  public void testSortingAscending() {
    PharmacyManagerUtils.sortByMassInGrams(ointments, SortType.ASCENDING);
    assertEquals(30, ointments.get(0).getMassInGrams());
    assertEquals(60, ointments.get(1).getMassInGrams());
    assertEquals(90, ointments.get(2).getMassInGrams());
    PharmacyManagerUtils.sortByPrice(ointments, SortType.ASCENDING);
    assertEquals(70, ointments.get(0).getPriceInUAH());
    assertEquals(130, ointments.get(1).getPriceInUAH());
    assertEquals(170, ointments.get(2).getPriceInUAH());
    PharmacyManagerUtils.sortByShelfLifeInMonths(ointments, SortType.ASCENDING);
    assertEquals(36, ointments.get(0).getShelfLifeInMonths());
    assertEquals(46, ointments.get(1).getShelfLifeInMonths());
    assertEquals(72, ointments.get(2).getShelfLifeInMonths());
    PharmacyManagerUtils.sortByNameOfProduct(ointments, SortType.ASCENDING);
    assertEquals("Artritsyn", ointments.get(0).getNameOfProduct());
    assertEquals("Dyklofenak", ointments.get(1).getNameOfProduct());
    assertEquals("Lanel", ointments.get(2).getNameOfProduct());
  }

}
