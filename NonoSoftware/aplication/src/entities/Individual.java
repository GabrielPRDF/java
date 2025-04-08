package entities;

public class Individual extends TaxPayer {
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}
	
	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double result = 0.0;
		if (anuallncome > 20000.00) {
			result = (anuallncome * 0.25) - (healthExpenditures * 0.50);
		} else {
			result = anuallncome * 0.15;
		}
		return result;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		sb.append(": $ ");
		sb.append(String.format("%.2f", tax()));
		return sb.toString();
	}
}
