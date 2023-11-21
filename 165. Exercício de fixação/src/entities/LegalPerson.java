package entities;

public class LegalPerson extends TaxPayer {

	private Integer employees;

	public LegalPerson() {
		super();
	}

	public LegalPerson(String name, Double income, Integer employees) {
		super(name, income);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public Double totalTax() {
		Double tax;
		if (employees > 10) {
			tax = getIncome() * 0.14;
		} else {
			tax = getIncome() * 0.16;
		}
		return tax;
	}

}
