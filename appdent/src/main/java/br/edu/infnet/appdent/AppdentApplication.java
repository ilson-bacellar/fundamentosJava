package br.edu.infnet.appdent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppdentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppdentApplication.class, args);
	}

}
