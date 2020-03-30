package ua.lviv.iot.pharmacy.model;

public class Pill extends AbstractMedicalProduct {
	private String structure;

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public Pill(int massInGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, boolean needOfDoctorsPrescription,
			String applicationMethod, String theraupeticEffect, Toxicity toxicityCategory, String structure) {
		super(massInGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, needOfDoctorsPrescription, applicationMethod, theraupeticEffect, toxicityCategory);
		this.structure = structure;
	}

	public String getHeaders() {
		return super.getHeaders() + ", structure";
	}

	public String toCSV() {
		return super.toCSV() + "," + structure;
	}

}
