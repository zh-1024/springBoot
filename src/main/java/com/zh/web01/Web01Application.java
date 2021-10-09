package com.zh.web01;

import com.zh.web01.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Web01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Web01Application.class, args);
		Pet pet = run.getBean("pet", Pet.class);
		System.out.println(pet);
	}

}
