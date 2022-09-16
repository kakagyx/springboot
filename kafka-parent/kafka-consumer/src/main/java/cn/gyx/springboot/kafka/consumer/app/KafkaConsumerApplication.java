package cn.gyx.springboot.kafka.consumer.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

import java.util.Arrays;


@SpringBootApplication
@ComponentScan({"cn.gyx.springboot.kafka"})
@EnableKafka
public class KafkaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerApplication.class, args);
        System.out.println("------------------Consumer Application Started----------------");
    }

}
