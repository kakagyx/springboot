package cn.gyx.springboot.kafka.service.impl;

import cn.gyx.springboot.kafka.service.api.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageServiceImpl implements IMessageService {
    @Value("${spring.kafka.topic}")
    private String topic;

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override public void sendMessage(String message){
        kafkaTemplate.send(topic,message);
    }
}
