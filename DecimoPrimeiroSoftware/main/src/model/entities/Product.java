package model.entities;

public class Product {
	private String name;
	private Double price;
	private Integer quantaty;
	
	public Product() { }

	public Product(String name, Double price, Integer quantaty) {
		this.name = name;
		this.price = price;
		this.quantaty = quantaty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantaty() {
		return quantaty;
	}

	public void setQuantaty(Integer quantaty) {
		this.quantaty = quantaty;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(",");
		sb.append(String.format("%.2f", price*quantaty));
		return sb.toString();
	}
}
