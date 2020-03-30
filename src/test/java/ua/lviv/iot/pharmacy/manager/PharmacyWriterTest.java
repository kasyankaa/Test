package ua.lviv.iot.pharmacy.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.pharmacy.model.AbstractPharmacyProduct;

public class PharmacyWriterTest extends BasePharmacyManagerTest {

	private static final String FILE_PATH = "products.csv";

	@BeforeEach
	public void setUp() {
		createPharmacies();
	}

	@Test
	public void writeToFile() throws IOException {

		try (Writer writerToFile = new FileWriter(FILE_PATH)) {

			PharmacyWriter writer = new PharmacyWriter();
			writer.setPharmacyWriter(writerToFile);
			writer.writeToFile(syringes);

		}
	}

	@Test
	public void testWriting() throws IOException {
		try (Writer csvWriter = new StringWriter()) {

			PharmacyWriter writer = new PharmacyWriter();
			writer.setPharmacyWriter(csvWriter);
			writer.writeToFile(syringes);

			String writtenString = "";

			for (AbstractPharmacyProduct product : syringes) {
				writtenString += product.getHeaders() + "\n" + product.toCSV() + "\n";
			}

			assertEquals(writtenString, writer.toString());

		}
	}

}
