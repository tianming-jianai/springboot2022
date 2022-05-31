package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.service.impl
 * @Author: 张世罡
 * @CreateTime: 2022-05-29 14:56
 * @Description:
 */
@Component
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Book> page(int current, int size) {
        IPage<Book> page = new Page<>(current, size);
        return bookDao.selectPage(page, null);
    }

    @Override
    public IPage<Book> page(int current, int size, Book book) {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType())
                .like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName())
                .like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());
        IPage<Book> page = new Page<>(current, size);
        return bookDao.selectPage(page, lqw);
    }
}
