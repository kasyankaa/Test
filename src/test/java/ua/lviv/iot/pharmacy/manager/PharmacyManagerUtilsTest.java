package ua.lviv.iot.pharmacy.manager;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.pharmacy.model.*;

public class PharmacyManagerUtilsTest extends BasePharmacyManagerTest {
	@Test
	public void testSortingDescending() {
		PharmacyManagerUtils.sortByShelfLife(pills, SortType.DESCENDING);
		PharmacyManagerUtils.sortByPrice(syringes, SortType.DESCENDING);
	}

	@Test
	public void testSortingAscending() {
		PharmacyManagerUtils.sortByShelfLife(syringes, SortType.ASCENDING);
		PharmacyManagerUtils.sortByPrice(pills, SortType.ASCENDING);
	}

}
