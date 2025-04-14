package model.entities;

public class Employee {
	public String name;
	public String email;
	public Double salary;
	
	public Employee() { }

	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(", ");
		sb.append(getEmail());
		sb.append(", ");
		sb.append(getSalary());		
		return sb.toString();
	}
}
