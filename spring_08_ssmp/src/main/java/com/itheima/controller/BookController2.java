package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import com.itheima.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.controller
 * @Author: 张世罡
 * @CreateTime: 2022-05-29 15:30
 * @Description:
 */
@RestController
@RequestMapping("/books")
public class BookController2 {
    @Autowired
    private IBookService bookService;

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        if ("123".equals(book.getName())) {
            // 骗骗编译器
            throw new IOException();
        }
        boolean flag = bookService.save(book);
        // 消息全部由后台管理
        return new R(flag, flag ? "添加成功^_^" : "添加失败-_-!");
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.updateById(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.removeById(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable("id") Integer id) {

        return new R(true, bookService.getById(id));
    }

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @GetMapping("/{current}/{size}")
    public R getByPage(@PathVariable int current, @PathVariable int size, Book book) {
        System.out.println("请求参数：" + book);
        IPage<Book> page = bookService.page(current, size, book);
        // 如果当前页码大于总页码值，那么重新执行查询，使用最大页码值作为当前页码值
        if (current > page.getPages()) {
            page = bookService.page((int) page.getPages(), size, book);
        }
        return new R(null != page, page);
    }
}
