package com.lshaci.xxljob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		synchronized (Application.class) {
			try {
				System.out.println("\n============= Spring Boot Server Start Success =============\n");
				Application.class.wait();
			} catch (InterruptedException e) {
				
				System.err.println("\n-----------------------------------------------------------");
				System.err.println("------------> Spring Boot Server Start Failed <------------");
				System.err.println("----------------> System Must Be Shutdown <----------------");
				System.err.println("-----------------------------------------------------------\n");
				
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
}
