package com.itheima;

import com.itheima.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring0101QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Spring0101QuickstartApplication.class, args);
        BookController bean = context.getBean(BookController.class);
        System.out.println("bean === " + bean);
    }

}
