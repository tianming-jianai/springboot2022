package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.controller
 * @Author: 张世罡
 * @CreateTime: 2022-05-25 19:15
 * @Description: Rest 模式
 */
@RestController
public class BookController {
    @GetMapping("/books/{id}")
    public String getById(@PathVariable("id") String id) {
        System.out.println("SpringBoot is running ...");
        System.out.println("id：" + id);
        return "SpringBoot is running ...";
    }
}
