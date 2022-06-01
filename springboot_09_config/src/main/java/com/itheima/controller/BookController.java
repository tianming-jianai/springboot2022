package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.controller
 * @Author: 张世罡
 * @CreateTime: 2022-06-01 16:41
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping
    public String getAll() {
        return "books";
    }
}
