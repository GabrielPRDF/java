package etities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import etities.enuns.OrderStatus;

public class Order {
	SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> order = new ArrayList<>();
	private Client client;
	
	public Order() {}
	
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
	
	public void addItem(OrderItem item) {
		order.add(item);
	}
	
	public void removeItem(OrderItem item) {
		order.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for (OrderItem x : order) {
			soma += x.getPrice() * x.getQuantaty();
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY:" + "\n");
		sb.append("Order moment: ");
		sb.append(stf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: " + client.getName());
		sb.append(" (" + stf.format(client.getBirthDate()));
		sb.append(") " + client.getEmail() + "\n");
		for (OrderItem x : order) {
			sb.append(x);
		}
		sb.append("Total price: $");
		sb.append(total());
		return sb.toString();
	}

}
