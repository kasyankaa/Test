package ua.lviv.iot.pharmacy.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.pharmacy.model.*;

public abstract class BasePharmacyManagerTest {
	protected List<AbstractPharmacyProduct> pills;
	protected List<AbstractPharmacyProduct> syringes;
	protected List<AbstractPharmacyProduct> ointments;

	public void createPill() {
		pills = new LinkedList<AbstractPharmacyProduct>();

		pills.add(new Pill(6, 36, 450, "Tritico", "Italy", "trazodon hydrochloride", "arrhytmia", true, "orally",
				"stabilizes emotional state", Toxicity.MIDDLE, "single layer"));
		pills.add(new Pill(3, 24, 120, "Noshpa", "Germany", "drovateryn hydrovhloride", "headache", false, "orally",
				"removes spasms", Toxicity.LOW, "single layer"));
		pills.add(new Pill(9, 12, 60, "Glicyset", "Germany", "drovateryn hydrovhloride", "headache", false, "orally",
				"removes spasms", Toxicity.LOW, "single layer"));

		pills.add(new Pill(6, 36, 457, "Tritico", "Italy", "trazodon hydrochloride", "arrhytmia", true, "orally",
				"stabilizes emotional state", Toxicity.MIDDLE, "single layer"));
		pills.add(new Pill(3, 24, 120, "Noshpa", "Germany", "drovateryn hydrovhloride", "headache", false, "orally",
				"removes spasms", Toxicity.LOW, "single layer"));


	}

	public void createSyringe() {
		syringes = new LinkedList<AbstractPharmacyProduct>();
		syringes.add(new Syringe(3, 120, 40, "disposable", "Ukraine", "plastic", "open injuries", 5, 15, 5));
		syringes.add(new Syringe(2, 120, 20, "frequentative", "Japan", "plastic", "open injuries", 3, 20, 25));
	}

	public void createOintment() {
		ointments = new LinkedList<AbstractPharmacyProduct>();
		ointments.add(new Ointment(30, 36, 170, "Dyklofenak", "Poland", "N", "allergy", false, "superficially",
				"removes spasm", Toxicity.LOW, "propilenhnikol"));

		ointments.add(new Ointment(60, 72, 130, "Artritsyn", "Ukraine", "S", "allergy", false, "superficially",
				"improves joints", Toxicity.LOW, "hondoprotector"));
		ointments.add(new Ointment(90, 46, 70, "Lanel", "Poland", "N", "allergy", false, "superficially",
				"removes spasm", Toxicity.LOW, "propilenhnikol"));

		ointments.add(new Ointment(60, 72, 430, "Artritsyn", "Ukraine", "S", "allergy", false, "superficially",
				"improves joints", Toxicity.LOW, "hondoprotector"));

	}

	public void createPharmacies() {
		createPill();
		createSyringe();
		createOintment();
	}

}
