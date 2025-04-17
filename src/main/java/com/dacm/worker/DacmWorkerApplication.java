package com.dacm.worker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.dacm.worker.*", "com.common.*" })
public class DacmWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DacmWorkerApplication.class, args);
	}

}
