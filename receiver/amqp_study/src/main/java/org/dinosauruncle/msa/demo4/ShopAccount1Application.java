package org.dinosauruncle.msa.demo4;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ShopAccount1Application {

	public static void main(String[] args) {
		SpringApplication.run(ShopAccount1Application.class, args);
	}

}

@Component
class Receiver{
	@RabbitListener(queues = "TestQ")
	public void processMessage(String content) {
		System.out.println(content);
	}
	
	
	
}
