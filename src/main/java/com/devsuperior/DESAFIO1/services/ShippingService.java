package com.devsuperior.DESAFIO1.services;

import org.springframework.stereotype.Service;

import com.devsuperior.DESAFIO1.entities.Order;

@Service
public class ShippingService {

	public double shippingService(Order order) {
		if (order.getBasic()< 100) {
			System.out.println(order.getBasic() - order.getDiscount() / 100 + 20 ); 
		}
		else if (order.getBasic()< 200 ){
			double x = order.getBasic() * order.getDiscount() / 100; // 30
			System.out.println(order.getBasic() - x  + 12);
		}
		else if (order.getBasic()> 200) {
			System.out.println("não precisa pagar Frete");
			double y = order.getBasic() * order.getDiscount() / 100;
			System.out.println(order.getBasic() - y);
					
			/*
			 * 
			 */
			 
		}
		return 0;
		
	}
		
}
	
	

