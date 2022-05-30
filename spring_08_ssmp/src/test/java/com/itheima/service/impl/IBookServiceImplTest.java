package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @Author: 张世罡
 * @Description:
 * @Date: Created in 14:58 2022/5/29
 * @Modified By:
 */
@SpringBootTest
class IBookServiceImplTest {
    @Autowired
    IBookService bookService;

    @Test
    void save() {
        Book book = new Book();
        book.setType("测试数据135");
        book.setName("测试数据135");
        book.setDescription("测试数据135");
        bookService.save(book);
    }

    @Test
    void update() {
        Book book = new Book();
        book.setId(6);
        book.setType("测试数据246");
        book.setName("测试数据246");
        book.setDescription("测试数据246");
        bookService.updateById(book);
    }

    @Test
    void delete() {
        Boolean delete = bookService.removeById(7);
        System.out.println(delete);
    }

    @Test
    void getById() {
        System.out.println(bookService.getById(7));
    }

    @Test
    void getAll() {
        System.out.println(bookService.list());
    }

    @Test
    void getByPage() {
        IPage<Book> page = new Page<>(1, 3);
        bookService.page(page);
        List records = page.getRecords();
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(records);
    }
}