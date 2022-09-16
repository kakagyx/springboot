package cn.gyx.springboot.kafka.producer.controller;

import cn.gyx.springboot.kafka.service.api.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceProducerController {

    @Autowired
    private IMessageService messageService;

    @RequestMapping("/sysinfo")
    public void getSystemInfo(){
        messageService.sendMessage("123123");
        System.out.println("send message to kafka");
    }
}
