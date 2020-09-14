package com.pgp.pcfdemo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PcfDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcfDemoApplication.class, args);
	}
}

@RestController
class PcfDemoController {
	@RequestMapping("/greetings")
    public String greet() {
 	    return "Hello, World!!";
    }
}

@Data
@Accessors (fluent = true)
class Greeting {
    private String message;
}
