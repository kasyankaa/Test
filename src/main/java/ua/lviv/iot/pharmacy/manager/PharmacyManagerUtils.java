package ua.lviv.iot.pharmacy.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.pharmacy.model.AbstractPharmacyProduct;
import ua.lviv.iot.pharmacy.model.SortType;

public class PharmacyManagerUtils {

	private static Comparator<AbstractPharmacyProduct> nameOfProductComparator = new Comparator<AbstractPharmacyProduct>() {

		@Override
		public int compare(AbstractPharmacyProduct firstProduct, AbstractPharmacyProduct secondProduct) {
			return firstProduct.getNameOfProduct().compareTo(secondProduct.getNameOfProduct());
		}
	};

	public static void sortByNameOfProduct(List<AbstractPharmacyProduct> pharmacies, SortType sortType) {
		if (sortType == SortType.ASCENDING) {
			pharmacies.sort(nameOfProductComparator);
		} else if (sortType == SortType.DESCENDING) {
			pharmacies.sort(nameOfProductComparator.reversed());
		}
	}

	static class SorterByMass implements Comparator<AbstractPharmacyProduct>, Serializable {
		static final long serialVersionUID = 597;

		@Override
		public int compare(AbstractPharmacyProduct firstProduct, AbstractPharmacyProduct secondProduct) {
			return (int) (firstProduct.getMassInGrams() - secondProduct.getMassInGrams());
		}

	}

	public static void sortByMassInGrams(List<AbstractPharmacyProduct> pharmacies, SortType sortType) {

		if (sortType == SortType.ASCENDING) {
			pharmacies.sort(new SorterByMass());
		} else if (sortType == SortType.DESCENDING) {
			pharmacies.sort(new SorterByMass().reversed());
		}

	}

	static Comparator<AbstractPharmacyProduct> SorterByShelfLifeInMonths = (AbstractPharmacyProduct firstProduct,
			AbstractPharmacyProduct secondProduct) -> firstProduct.getShelfLifeInMonths()
					- secondProduct.getShelfLifeInMonths();

	public static void sortByShelfLifeInMonths(List<AbstractPharmacyProduct> dairyProducts, SortType sortType) {
		if (sortType == SortType.ASCENDING) {
			dairyProducts.sort(SorterByShelfLifeInMonths);
		} else if (sortType == SortType.DESCENDING) {
			dairyProducts.sort(SorterByShelfLifeInMonths.reversed());
		}
	}

	class SorterByPrice implements Comparator<AbstractPharmacyProduct> {

		@Override
		public int compare(AbstractPharmacyProduct firstProduct, AbstractPharmacyProduct secondProduct) {
			return (int) (firstProduct.getPriceInUAH() - secondProduct.getPriceInUAH());
		}
	}

	public static void sortByPrice(List<AbstractPharmacyProduct> pharmacies, SortType sortType) {
		if (sortType == SortType.ASCENDING) {
			pharmacies.sort(new PharmacyManagerUtils().new SorterByPrice());
		} else if (sortType == SortType.DESCENDING) {
			pharmacies.sort(new PharmacyManagerUtils().new SorterByPrice().reversed());
		}
	}

}
