package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;

import java.util.List;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.service
 * @Author: 张世罡
 * @CreateTime: 2022-05-29 14:21
 * @Description:
 */
public interface BookService {
    Boolean save(Book book);

    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getByPage(int current, int size);
}
