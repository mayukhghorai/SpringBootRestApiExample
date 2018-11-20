package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Ext-MayukhG on 7/4/2018.
 */
@SpringBootApplication(scanBasePackages = {"com.websystique.springboot"})
public class SpringBootRestApiApp {

//    @Autowired
//    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApiApp.class, args);
//        SpringApplication app = new SpringApplication(RefDataApplication.class);
//        app.setWebEnvironment(false);
//        ConfigurableApplicationContext ctx = app.run(args);
    }
}
