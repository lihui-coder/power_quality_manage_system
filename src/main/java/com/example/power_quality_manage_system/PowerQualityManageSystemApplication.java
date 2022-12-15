package com.example.power_quality_manage_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.power_quality_manage_system.mapper")
public class PowerQualityManageSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerQualityManageSystemApplication.class, args);
	}
}
