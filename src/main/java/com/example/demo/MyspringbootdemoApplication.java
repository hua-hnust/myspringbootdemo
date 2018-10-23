package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//扫描绑定 解决mapper注入问题
@MapperScan("com.example.demo.dao")
public class MyspringbootdemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(MyspringbootdemoApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MyspringbootdemoApplication.class);
	}

}
