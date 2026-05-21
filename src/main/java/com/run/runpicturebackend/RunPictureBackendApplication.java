package com.run.runpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.run.runpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class RunPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunPictureBackendApplication.class, args);
    }

}
