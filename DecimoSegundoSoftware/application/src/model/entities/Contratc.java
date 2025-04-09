package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Contratc {
	DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");;
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	private List<Installment> list = new ArrayList<>();
	public Contratc() {}
	
	public Contratc(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getList() {
		return list;
	}

	public void removeList(Installment obj) {
		this.list.remove(obj);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Installment obj : list ) {
			sb.append(sdf.format(obj.getDueDate()));
			sb.append(" - ");
			sb.append(String.format("%.2f", obj.getAmount()));
			sb.append("\n");
		}
		return sb.toString();
	}
}
