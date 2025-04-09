package model.services;

public interface PaypalService {
	Double payment(Double amount);
	Double interest(Double amount, Integer months);
}
