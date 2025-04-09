package model.services;

import model.entities.Contratc;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService (OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contratc contract, Integer months) {
		double value = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			double valueSoma = onlinePaymentService.paymentFee(onlinePaymentService.interest(value, i));
			contract.getList().add(new Installment(contract.getDate().plusMonths(i), valueSoma));
		}
		
	}
}
