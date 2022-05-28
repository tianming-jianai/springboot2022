package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.dao
 * @Author: 张世罡
 * @CreateTime: 2022-05-28 15:07
 * @Description:
 */
@SpringBootTest
public class BookDaoTests {

    @Autowired
    BookDao bookDao;

    @Test
    public void getByIdTest() {
        System.out.println(bookDao.selectById(5));
    }

    @Test
    public void testSave() {
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    public void testUpdate() {
        Book book = new Book();
        book.setId(6);
        book.setType("测试数据abc");
        book.setName("测试数据abc");
        book.setDescription("测试数据abc");
        bookDao.updateById(book);
    }

    @Test
    public void testDelete() {
        int i = bookDao.deleteById(5);
        System.out.println(i);
    }

    @Test
    public void testGetAll() {
        System.out.println(bookDao.selectList(null));
    }

    @Test
    public void testGetPage() {
        IPage page = new Page(1, 3);
        bookDao.selectPage(page, null);
        List records = page.getRecords();
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.getPages());
        System.out.println(records);
    }

    @Test
    public void testGetBy() {
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "Java");
        bookDao.selectList(queryWrapper);

        String name = "";
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(StringUtils.hasText(name), Book::getName, name);
        bookDao.selectList(lambdaQueryWrapper);
    }
}
