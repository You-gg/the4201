package com;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ohhhhhhhhh
 * @description:
 * @date 2021/6/18 15:48
 */
@SpringBootApplication
@MapperScan("com.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
