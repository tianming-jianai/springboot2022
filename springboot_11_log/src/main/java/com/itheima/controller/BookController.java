package com.itheima.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getAll() {
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        return "books";
    }
}
