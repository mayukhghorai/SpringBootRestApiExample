package com.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Ext-MayukhG on 7/9/2018.
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringBootRestClient implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestClient.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        getUsersJSON();
    }


    private void getUsersJSON() {
        final String uri = "http://localhost:8080/api/users.json";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        System.out.println(result);
    }
}
