package cn.gyx.springboot.liteflow.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"cn.gyx.springboot.liteflow"})
public class LiteflowApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiteflowApplication.class, args);
        System.out.println("------------------Liteflow Application Started----------------");
    }

}
