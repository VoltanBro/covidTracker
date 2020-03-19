package com.voltanbro.covidstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CovidstatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CovidstatsApplication.class, args);
	}

}
