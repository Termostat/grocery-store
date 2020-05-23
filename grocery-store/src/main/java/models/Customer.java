package models;

import java.util.Calendar;

public class Customer {

	private int id;
	private String name;
	private Calendar customerSince;
	
	public Customer() {
		super();
	}


	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Calendar getCustomerSince() {
		return customerSince;
	}

	public void setCustomerSince(final Calendar customerSince) {
		this.customerSince = customerSince;
	}
	
	
	
}
