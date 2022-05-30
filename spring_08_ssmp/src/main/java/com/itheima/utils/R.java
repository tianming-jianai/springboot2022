package com.itheima.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.utils
 * @Author: 张世罡
 * @CreateTime: 2022-05-29 16:11
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    private Boolean flag;
    private Object data;

    public R(Boolean flag) {
        this.flag = flag;
    }
}
