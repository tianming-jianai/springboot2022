package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.service
 * @Author: 张世罡
 * @CreateTime: 2022-05-29 14:52
 * @Description:
 */
public interface IBookService extends IService<Book> {
    /**
     * 接收参数返回页数据
     *
     * @param current 当前页
     * @param size    每页条数
     * @return
     */
    IPage<Book> page(int current, int size);

    IPage<Book> page(int current, int size, Book book);
}
