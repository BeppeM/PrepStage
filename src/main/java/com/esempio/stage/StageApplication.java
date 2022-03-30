package com.esempio.stage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class StageApplication {

	public static void main(String[] args) {
		SpringApplication.run(StageApplication.class, args);
	}

}
