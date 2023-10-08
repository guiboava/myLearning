package entities;

public class Employee {
	
	
	protected String name;
	protected Integer hours;
	protected Double valuePerHour;
	
	public Employee() {
		
	}
	
	public Employee(String name, Integer hour, Double valuePerHour) {
		this.name = name;
		this.hours = hour;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHour() {
		return hours;
	}

	public void setHour(Integer hour) {
		this.hours = hour;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Double payment() {
		return hours * valuePerHour;
	}
	
}
