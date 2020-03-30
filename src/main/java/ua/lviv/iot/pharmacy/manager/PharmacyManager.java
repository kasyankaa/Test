package ua.lviv.iot.pharmacy.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.pharmacy.model.AbstractPharmacyProduct;

public class PharmacyManager {

	private List<AbstractPharmacyProduct> products = new LinkedList<>();

	public void addProducts(List<AbstractPharmacyProduct> products) {

		this.products.addAll(products);
	}

	public List<AbstractPharmacyProduct> findProductByMass(int mass) {

		LinkedList<AbstractPharmacyProduct> result = new LinkedList<AbstractPharmacyProduct>();
		for (AbstractPharmacyProduct productWithRequiredMass : products) {
			if (productWithRequiredMass.getMassInGrams() == mass) {
				result.add(productWithRequiredMass);
			}
		}
		return result;
	}

	public List<AbstractPharmacyProduct> findProductByPrice(double minPrice, double maxPrice) {

		LinkedList<AbstractPharmacyProduct> result = new LinkedList<AbstractPharmacyProduct>();
		for (AbstractPharmacyProduct productWithRequiredPrice : products) {
			if (productWithRequiredPrice.getPriceInUAH() >= minPrice
					&& productWithRequiredPrice.getPriceInUAH() <= maxPrice) {
				result.add(productWithRequiredPrice);
			}
		}
		return result;
	}

}
