package cn.gyx.springboot.kafka.producer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan({"cn.gyx.springboot.kafka"})
public class KafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);

    }

}
