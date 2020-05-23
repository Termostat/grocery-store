package models;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

public class Order {

	private int id;
	private Calendar date;
	private Customer customer;
	private Set<OrderLine> orderLines = new LinkedHashSet<OrderLine>();
	
	public Order() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(final Calendar date) {
		this.date = date;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(final Customer customer) {
		this.customer = customer;
	}
	public Set<OrderLine> getOrderLines() {
		return orderLines;
	}
	
}
