package com.devsuperior.DESAFIO1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.DESAFIO1.entities.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;
	
	
	public double total (Order order) {
		return order.getBasic()
				- shippingService.shippingService(order);
	}
}
