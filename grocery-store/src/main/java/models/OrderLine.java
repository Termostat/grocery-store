package models;

public class OrderLine {

	private Product product;
	private int amount;
	private float purchasePrice;
	
	public OrderLine() {
		super();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(final Product product) {
		this.product = product;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(final int amount) {
		this.amount = amount;
	}

	public float getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(final float purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	
	
}
