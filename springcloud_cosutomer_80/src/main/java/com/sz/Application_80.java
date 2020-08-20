package com.sz;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient  //标注为eureka的客户端 ，因为我们现在是通过集群访问的微服务
public class Application_80 {
    public static void main(String[] args) {
        SpringApplication.run(Application_80.class,args);
    }
}
