package com.itheima;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima
 * @Author: 张世罡
 * @CreateTime: 2022-05-27 15:41
 * @Description:
 * 1. 定义数据模型封装yaml文件中对应的数据
 * 2. 定义为Spring管控的bean
 * 3. 指定加载的数据
 */
@Data
@Component
@ConfigurationProperties(prefix = "datasource")
public class MyDataSource {
    private String driver;
    private String url;
    private String username;
    private String password;
}
