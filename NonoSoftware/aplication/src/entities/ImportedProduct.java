package entities;

public class ImportedProduct extends Product {
	private Double customsFree;
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		this.customsFree = customsFree;
	}

	public Double getCustomsFree() {
		return customsFree;
	}

	public void setCustomsFree(Double customsFree) {
		this.customsFree = customsFree;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(" $ ");
		sb.append(String.format("%.2f", totalPrice()));
		sb.append(" (Customs fee: $ ");
		sb.append(String.format("%.2f", customsFree));
		sb.append(")");
		sb.append("\n");
		return sb.toString();
	}
	
	public Double totalPrice() {
		return price + customsFree;
	}
}
