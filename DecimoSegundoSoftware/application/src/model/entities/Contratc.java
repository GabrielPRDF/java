package model.entities;

import java.util.Date;
import java.util.List;

public class Contratc {
	private Integer number;
	private Date date;
	private Double totalValue;
	private List<Installment> list;
	public Contratc() {}
	
	public Contratc(Integer number, Date date, Double totalValue) {
		super();
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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

	public void addList(Installment obj) {
		this.list.add(obj);
	}

	public void removeList(Installment obj) {
		this.list.remove(obj);
	}
}
