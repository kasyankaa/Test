package ua.lviv.iot.pharmacy.model;

public class Pill extends AbstractMedicalProduct {
	private String structure;

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public Pill(int massinGrams, int shelfLifeInMonths, double priceInUAH, String nameOfProduct,
			String producingCountry, String compositionOfProduct, String sideEffects, boolean needOfDoctorsPrescription,
			String applicationMethod, String theraupeticEffect, Toxicity toxicityCategory, String structure) {
		super(massinGrams, shelfLifeInMonths, priceInUAH, nameOfProduct, producingCountry, compositionOfProduct,
				sideEffects, needOfDoctorsPrescription, applicationMethod, theraupeticEffect, toxicityCategory);
		this.structure = structure;
	}

}
