package com.example.simple_web_application;

import java.util.Arrays;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleWebApplication.class, args);
	}
        
        @Bean
        public CommandLineRunner CommandLineRunner(ApplicationContext ctx){
            return args-> {
                
                System.out.println("lets inspect the beans provided by spring");
                String[] beanNames = ctx.getBeanDefinitionNames("");
                Arrays.sort(beanNames);
                for (String beanName: beanNames){
                    
                    System.out.println(beanName);
                }
            };
        }
}
