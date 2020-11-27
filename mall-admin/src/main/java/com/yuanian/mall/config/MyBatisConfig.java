package com.yuanian.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis相关配置
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.yuanian.mall.mapper","com.yuanian.mall.dao"})
public class MyBatisConfig {
}
