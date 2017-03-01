package io.unicorn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class MvpSpringCloudConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvpSpringCloudConsulApplication.class, args);
	}

	@GetMapping
	public ResponseEntity<String> sayHello() {
	    return ResponseEntity.ok("Hello there !");
    }
}
