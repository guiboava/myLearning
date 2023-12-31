package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	private Department departmant;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department departmant) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departmant = departmant;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartmant() {
		return this.departmant;
	}

	public void setDepartmant(Department departmant) {
		this.departmant = departmant;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(int year, int month) {
		double sum = baseSalary;
		LocalDate cDate;
		
		for (HourContract c : contracts) {
			
			cDate = c.getDate();
			int c_year = cDate.getYear();
			int c_month = cDate.getMonthValue();
			
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	public String toString() {
		return "Name: " +
				name +
				"\nDepartment: " +
				departmant.getName();
		
	}

}
