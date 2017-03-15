package gov.samhsa.c2s.pls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PlsApplication {

    public static void main(String[] args) {
        SpringApplication.run(PlsApplication.class, args);
    }
}