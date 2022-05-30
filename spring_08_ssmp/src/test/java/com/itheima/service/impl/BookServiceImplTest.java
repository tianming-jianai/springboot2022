package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author: 张世罡
 * @Description:
 * @Date: Created in 14:28 2022/5/29
 * @Modified By:
 */
@SpringBootTest
class BookServiceImplTest {

    @Autowired
    BookService bookService;

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
        book.setId(7);
        book.setType("测试数据246");
        book.setName("测试数据246");
        book.setDescription("测试数据246");
        bookService.update(book);
    }

    @Test
    void delete() {
        Boolean delete = bookService.delete(8);
        System.out.println(delete);
    }

    @Test
    void getById() {
        System.out.println(bookService.getById(7));
    }

    @Test
    void getAll() {
        System.out.println(bookService.getAll());
    }

    @Test
    void getByPage() {
        IPage<Book> page = bookService.getByPage(1, 3);
        List records = page.getRecords();
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(records);
    }
}