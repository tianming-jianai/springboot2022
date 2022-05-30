package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
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
        return bookDao.selectPage(page,null);
    }
}
