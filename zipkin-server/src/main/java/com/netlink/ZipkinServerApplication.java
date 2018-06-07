package com.netlink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

/**
 * ZipkinServerApplication
 *
 * @author fubencheng
 * @version 0.0.1 2018-05-15 10:44 fubencheng
 */
//@EnableZipkinStreamServer
@EnableZipkinServer
@SpringBootApplication
public class ZipkinServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerApplication.class, args);
    }
}
