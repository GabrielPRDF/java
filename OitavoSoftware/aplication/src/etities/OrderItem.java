package etities;

public class OrderItem {
	private Integer quantaty;
	private Double price;
	private Product product;
	
	public OrderItem(Integer quantaty, Double price, Product product) {
		this.quantaty = quantaty;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantaty() {
		return quantaty;
	}

	public void setQuantaty(Integer quantaty) {
		this.quantaty = quantaty;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return price * quantaty;
	}
}
