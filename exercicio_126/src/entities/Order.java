package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
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

	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		double sum =0.00;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		
		return sum;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
        sb.append("ORDER SUMMARY \n");
		sb.append("Order moment: " + sdf2.format(this.getMoment())+"\n");
		sb.append("Order Status: " + this.getStatus() +"\n");
		sb.append(client);
		sb.append("Order items : \n");
		
		for (OrderItem item: items) {
           sb.append( item );
		}
		sb.append("Total price: $" + String.format("%.2f", this.total()));
		return sb.toString();
	}
	
	
	
}
