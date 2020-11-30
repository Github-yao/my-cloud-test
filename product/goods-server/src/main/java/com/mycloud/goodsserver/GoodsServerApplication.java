package com.mycloud.goodsserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class )
@EnableEurekaClient
@MapperScan(basePackages = "com.mycloud.goodsserver.dao")
public class GoodsServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoodsServerApplication.class, args);
	}

}
