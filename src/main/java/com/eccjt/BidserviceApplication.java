package com.eccjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//mapper 接口类配置
@MapperScan("com.eccjt.bidservice..dao")
public class BidserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidserviceApplication.class, args);
	}
}
