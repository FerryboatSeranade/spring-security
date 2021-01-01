package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloApplication
 *
 * @title: HelloApplication
 * @Author shu.shen
 * @Date: 2021/1/1 17:18
 * @Version 1.0
 */
@SpringBootApplication
@RestController
public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		return "hello, this is security application";
	}

}
