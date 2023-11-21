package entities;

public class PhysicalPerson extends TaxPayer {

	public Double spendedHealth;

	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String name, Double income, Double spendedHealth) {
		super(name, income);
		this.spendedHealth = spendedHealth;
	}

	public Double getSpendedHealth() {
		return spendedHealth;
	}

	public void setSpendedHealth(Double spendedHealth) {
		this.spendedHealth = spendedHealth;
	}

	@Override
	public Double totalTax() {
		Double tax;
		if (getIncome() < 20000.00) {
			tax = getIncome() * 0.15;
		} else {
			tax = getIncome() * 0.25;
		}
		if (spendedHealth != 0.00) {
			tax -= spendedHealth/2;
		}
		return tax;
	}
}
