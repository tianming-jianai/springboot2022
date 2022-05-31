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
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(String msg) {
        this.flag = false;
        this.msg = msg;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }
}
