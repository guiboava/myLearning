package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{
		
	private LocalDate manufactureDate;
	
	private DateTimeFormatter frt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public LocalDate getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(LocalDate manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName() +
				" (used) $ " +
				String.format("%.2f", getPrice()) + 
				"(Manufacture date: " +
				frt01.format(manufactureDate)+
				String.format(")%n");
				
	}
	
}
