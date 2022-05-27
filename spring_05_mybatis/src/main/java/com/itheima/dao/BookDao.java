package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.dao
 * @Author: 张世罡
 * @CreateTime: 2022-05-27 16:36
 * @Description:
 */
@Mapper
public interface BookDao {
    @Select("select * from book where id = #{id}")
    public Book getById(Integer id);
}
