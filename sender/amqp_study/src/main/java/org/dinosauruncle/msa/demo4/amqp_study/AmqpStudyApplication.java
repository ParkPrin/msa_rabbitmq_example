package org.dinosauruncle.msa.demo4.amqp_study;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



@SpringBootApplication
public class AmqpStudyApplication implements CommandLineRunner {

    @Autowired
    Sender sender;

    public static void main(String[] args) {
        SpringApplication.run(AmqpStudyApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        sender.send("Hello Messaging..!!!");
    }
}

@Component
class Sender {
    @Autowired
    RabbitMessagingTemplate template;

    @Bean
    Queue queue(){
        return new Queue("TestQ", false);
    }

    public void send(String message){
        template.convertAndSend("TestQ", message);
    }
}

