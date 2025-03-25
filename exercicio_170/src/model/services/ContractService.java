package model.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService; 

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}


	public void processContract (Contract contract, Integer months) {
	    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    double basicQuota = contract.getTotalValue() / months;
	    
		for (int i=1; i <= months; i++  ) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee( (basicQuota+interest) );
			double quota  = basicQuota + interest + fee;
			contract.getInstallments().add(new Installment (dueDate, quota) );
		}
	}
}
