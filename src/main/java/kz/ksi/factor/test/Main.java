package kz.ksi.factor.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ws.config.annotation.EnableWs;

/**
 * Created by Erlan.Ibraev on 05.07.2016.
 */
@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
@EnableWs
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Main.class, args);
    }
}
