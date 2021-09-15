package consumer.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @KafkaListener(topics = "example", groupId = "group_id")
    public void consume(String message){
        System.out.println("Mensagem: "+ message);
    }
}
