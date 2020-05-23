package models;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private int id;
	private String name;
	private float price;
	private boolean inStock;
	private List<Comment> comment = new ArrayList<Comment>();
	
	public Product() {
		super();
	}
	
	public Product(final int id, final String name, final float price, final boolean inStock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.inStock = inStock;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(final float price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(final boolean inStock) {
		this.inStock = inStock;
	}
	public List<Comment> getComment() {
		return comment;
	}

}
