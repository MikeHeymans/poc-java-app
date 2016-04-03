package be.hogent.pocjavaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import be.hogent.pocjavaapp.Application;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "be.hogent.pocjavaapp")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
