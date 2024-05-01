package com.tj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class oppdoor_travell_planner {

	public static void main(String[] args) {
		SpringApplication.run(oppdoor_travell_planner.class, args);
	}

}
