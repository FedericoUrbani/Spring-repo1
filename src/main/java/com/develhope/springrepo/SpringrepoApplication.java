package com.develhope.springrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication//(exclude={DataSourceAutoConfiguration.class})
public class SpringrepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrepoApplication.class, args);
	}

}
