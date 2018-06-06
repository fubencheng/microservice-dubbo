package com.netlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ImageServiceConsumerApplication
 *
 * @author fubencheng
 * @version 0.0.1 2018-05-15 10:44 fubencheng
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ImageServiceConsumerApplication {
    public static void main( String[] args ) {
        SpringApplication.run(ImageServiceConsumerApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }
}
