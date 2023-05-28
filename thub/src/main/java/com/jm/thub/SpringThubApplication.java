package com.jm.thub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringThubApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringThubApplication.class, args);
//        System.out.println("启动成功：Sa-Token配置如下：" + SaManager.getConfig());
    }

}
