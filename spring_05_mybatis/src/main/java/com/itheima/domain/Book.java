package com.itheima.domain;

import lombok.Data;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.domain
 * @Author: 张世罡
 * @CreateTime: 2022-05-27 16:34
 * @Description:
 */
@Data
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
