package ua.lviv.iot.pharmacy.manager;

import java.io.IOException;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.pharmacy.model.AbstractPharmacyProduct;

public class PharmacyWriter {
	private Writer productWriter;

	public void setPharmacyWriter(Writer productWriter) {
		this.productWriter = productWriter;
	}

	public void writeToFile(List<AbstractPharmacyProduct> pharmacies) throws IOException {

		for (AbstractPharmacyProduct product : pharmacies) {
			writeLine(this.productWriter, product.getHeaders());
			writeLine(this.productWriter, product.toCSV());
		}
		this.productWriter.flush();
	}

	private void writeLine(Writer productWriter, String line) throws IOException {
		productWriter.write(line + "\n");
	}

	@Override

	public String toString() {
		return productWriter.toString();
	}

}
