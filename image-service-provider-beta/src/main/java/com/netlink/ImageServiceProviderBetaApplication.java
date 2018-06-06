package com.netlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * ImageServiceProviderBetaApplication
 *
 * @author fubencheng
 * @version 0.0.1 2018-05-15 10:44 fubencheng
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ImageServiceProviderBetaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageServiceProviderBetaApplication.class, args);
    }
}
