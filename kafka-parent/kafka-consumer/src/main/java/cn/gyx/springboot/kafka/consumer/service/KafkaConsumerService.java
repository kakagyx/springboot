package cn.gyx.springboot.kafka.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerService  {

    @KafkaListener(id="consumeSingle", topics ="test")
    public void consumeSingle(String message){
        System.out.println("consumerSingle ====> message: "+ message);
    }
}
