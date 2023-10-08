package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static DateTimeFormatter frt01 = DateTimeFormatter.ofPattern("(dd/MM/yyyy)");
	private static DateTimeFormatter frt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime moment;
	private OrderStatus orderStatus;

	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();

	public Order() {

	}

	public Order(LocalDateTime moment, OrderStatus orderStatus, Client client) {
		this.moment = moment;
		this.orderStatus = orderStatus;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem item) {
		orderItem.add(item);
	}

	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}

	public Double total() {
		double locTotal = 0;
		for (OrderItem o : orderItem) {
			locTotal += o.subTotal();
		}
		return locTotal;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(frt02.format(moment) + "\n");
		sb.append("Order statud: ");
		sb.append(orderStatus + "\n");
		sb.append("Client: ");
		sb.append(client.getName() + " " + frt01.format(client.getBirthDate()) + " - " + client.getEmail() + "\n");
		sb.append("Order items:\n");
		for (OrderItem o : orderItem) {
			sb.append(o.getProduct().getName() + ", $");
			sb.append(String.format("%.2f",o.getProduct().getPrice()) + ", ");
			sb.append("Quantity: ");
			sb.append(o.getQuantity() + ", ");
			sb.append("Subtotal: $");
			sb.append(String.format("%.2f",o.subTotal()) + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f",total()));
		return sb.toString();
	}

}
