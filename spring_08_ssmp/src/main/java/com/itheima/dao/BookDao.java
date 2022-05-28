package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.dao
 * @Author: 张世罡
 * @CreateTime: 2022-05-27 16:36
 * @Description:
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
}
