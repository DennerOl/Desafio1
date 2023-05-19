package com.devsuperior.DESAFIO1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.DESAFIO1.entities.Order;
import com.devsuperior.DESAFIO1.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class Desafio1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;
	
	
	public Desafio1Application(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Desafio1Application.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("inicio ");
		Order order = new Order(1309 , 95.90 , 00.0);
		double orderServic = orderService.total(order);
		
		System.out.println(order.getCode());

	}
}
