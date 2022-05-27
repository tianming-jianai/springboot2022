package com.itheima.controller;

import com.itheima.MyDataSource;
import com.itheima.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.controller
 * @Author: 张世罡
 * @CreateTime: 2022-05-25 19:15
 * @Description: Rest 模式
 */
@RestController
@RequestMapping("/books")
public class BookController {

    // 读取yaml单一数据
    @Value("${country}")
    private String country;
    @Value("${user.name}")
    private String name;
    @Value("${likes[1]}")
    private String likes1;
    @Value("${users[1].age}")
    private String age1;
    @Value("${server.port}")
    private String port;
    @Value("${tempDir}")
    private String tempDir;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Integer id) {
        System.out.println("book getById ..." + id);
        System.out.println("country: " + country);
        System.out.println("name: " + name);
        System.out.println("likes1: " + likes1);
        System.out.println("age1: " + age1);
        System.out.println("port: " + port);
        System.out.println("tempDir: " + tempDir);
        return "{'module':'book getById'}";
    }

    @PostMapping
    public String save() {
        System.out.println("book save ...");
        return "{'module':'book save'}";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Integer id) {
        System.out.println("book delete ..." + id);
        return "{'module':'book delete'}";
    }

    @PutMapping
    public String update(@RequestBody Book book) {
        System.out.println("book save ..." + book);
        return "{'module':'book update'}";
    }

    @Autowired
    private Environment env;
    @Autowired
    private MyDataSource myDataSource;

    @GetMapping
    public String getAll() {
        System.out.println("book getAll ...");
        System.out.println("port: " + env.getProperty("server.port"));
        System.out.println("myDataSource: " + myDataSource);
        return "{'module':'book getAll'}";
    }
}

