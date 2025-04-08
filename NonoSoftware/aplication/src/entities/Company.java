package entities;

public class Company extends TaxPayer {
	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double anuallncome, Integer numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		double percent = numberOfEmployees > 10 ? 0.14 : 0.16;
		return anuallncome * percent;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": $ ");
		sb.append(String.format("%.2f", tax()));
		return sb.toString();
	}
}
