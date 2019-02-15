package model.services;

public class PaypalService implements OnlinePaymentService {

	public Double paymentFee (double amount) {
		return amount + 2/100;
		
	}
	public Double interest (double amount, Integer months) {
		return amount * 0.1 * months;
	}
	
}
