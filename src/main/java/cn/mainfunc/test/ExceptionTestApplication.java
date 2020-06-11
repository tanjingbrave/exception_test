package cn.mainfunc.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"cn.mainfunc.test.core.dao"}) //扫描DAO
public class ExceptionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExceptionTestApplication.class, args);
    }

}
