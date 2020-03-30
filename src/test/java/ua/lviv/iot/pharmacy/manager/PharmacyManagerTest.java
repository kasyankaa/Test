package ua.lviv.iot.pharmacy.manager;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.pharmacy.model.AbstractPharmacyProduct;

class PharmacyManagerTest extends BasePharmacyManagerTest{
	
	private PharmacyManager pharmacyManager;
	@BeforeEach
	public void setUp(){
		pharmacyManager = new PharmacyManager();
		createPharmacies();
		
		pharmacyManager.addProducts(pills);
		pharmacyManager.addProducts(syringes);
		pharmacyManager.addProducts(ointments);	
	}
	@Test
	public void testFindByMass() {
		List<AbstractPharmacyProduct> actual=pharmacyManager.findProductByMass(3);
		assertEquals(actual.get(0).getMassInGrams(),3);
		assertEquals(actual.get(1).getMassInGrams(),3);
		
		
	}
	@Test
	public void testFindByPrice() {
		List<AbstractPharmacyProduct> actual=pharmacyManager.findProductByPrice(100,200);
		assertEquals(actual.get(0).getPriceInUAH(),120);
		assertEquals(actual.get(1).getPriceInUAH(),170);
		
	}
	

	
	


}
