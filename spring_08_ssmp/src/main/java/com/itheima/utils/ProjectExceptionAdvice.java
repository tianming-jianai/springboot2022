package com.itheima.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima.utils
 * @Author: 张世罡
 * @CreateTime: 2022-05-31 13:54
 * @Description: 作为SpringMVC的异常处理器
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    // 拦截所有异常信息
    @ExceptionHandler
    public R doException(Exception ex) {
        // 记录日志
        // 通知运维
        // 通知开发
        return new R("服务器故障，请稍后再试！");
    }
}
