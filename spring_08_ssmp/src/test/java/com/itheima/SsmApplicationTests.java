package com.itheima;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @BelongsProject: springboot2022
 * @BelongsPackage: com.itheima
 * @Author: 张世罡
 * @CreateTime: 2022-05-28 15:16
 * @Description:
 */
@SpringBootTest
public class SsmApplicationTests {
    @Autowired
    private StringEncryptor encryptor;

    @Value("${spring.datasource.druid.url}")
    private String url;
    @Value("${spring.datasource.druid.username}")
    private String username;
    @Value("${spring.datasource.druid.password}")
    private String password;

    @Test
    void contextLoads() {
        System.out.println(url);
        System.out.println(encryptor.encrypt(url));
        System.out.println(encryptor.encrypt(username));
        System.out.println(encryptor.encrypt(password));
    }
}
