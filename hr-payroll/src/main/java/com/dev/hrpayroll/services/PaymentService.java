package com.dev.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.dev.hrpayroll.entities.Payment;


@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("bob", 200.00, days);
	}

}
