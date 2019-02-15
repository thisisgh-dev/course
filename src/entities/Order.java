package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

	private Date moment;
	private OrderStatus status;

	private Client client;

	private List<OrderItem> items = new ArrayList<>();

	public Order() {

	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	/*
	 * public void setItems(List<OrderItem> items) { this.items = items; }
	 */

	public static SimpleDateFormat getDate() {
		return date;
	}

	/*public static void setDate(SimpleDateFormat date) {
		Order.date = date;
	}*/

	public void addItem(OrderItem Items) {
		items.add(Items);

	}

	public void removeItem(OrderItem Items) {
		items.remove(Items);
	}

	public Double total() {
		double sum = 0;
		
		for(OrderItem x : items) {
			sum += x.subTotal();
			
		}
		return sum;
	}
	
	public String toString() {
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		StringBuilder sb  = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + date.format(moment) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (");
		sb.append(getDate().format(client.getBirthDate()) + ") - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order items: \n");
		
		
		
		for(OrderItem x : items) {
			sb.append(x.getProduct().getName());
			sb.append(String.format(", $%.2f", x.getPrice()));
			sb.append(", Quantity: " + x.getQuantity());
			sb.append(String.format(", Subtotal: $%.2f", x.subTotal()));
			sb.append("\n");
		}
		
		sb.append(String.format("Total price: $%.2f", total()));
		
		
		return sb.toString();
	}
	
}
