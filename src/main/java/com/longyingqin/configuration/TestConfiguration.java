package com.longyingqin.configuration;

import com.longyingqin.dto.TestClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ================================================================
 * 说明：当前类说说明
 * <p>
 * 作者          时间                    注释
 * 刘梓江	2020/4/21  14:29            创建
 * =================================================================
 **/

@Configuration
public class TestConfiguration {

    @Bean
    public TestClass createTest(){
        return new TestClass();
    }
    @Bean
    public TestClass createTest2(){
        return new TestClass();
    }
}
    
    
    