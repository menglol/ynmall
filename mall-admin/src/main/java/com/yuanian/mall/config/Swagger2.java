package com.yuanian.mall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class Swagger2 extends WebMvcConfigurationSupport{
        /**
         * @Description: 防止@EnableMvc把默认的静态资源路径覆盖了，手动设置的方式，
         * 						我这里无法访问的原因是访问路径被拦截
         * @Param: registry
         * @return:
         * @Author:
         * @Date: 2019/12/11
         */
        @Override
        protected void addResourceHandlers(ResourceHandlerRegistry registry) {
            // 解决swagger无法访问
            registry.addResourceHandler("/swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
            // 解决swagger的js文件无法访问
            registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        }
}