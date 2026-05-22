package com.run.runpicturebackend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局跨域配置类
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //覆盖所有请求
        registry.addMapping("/**")
                // 允许发送Cookie等凭证信息
                .allowCredentials(true)
                //放行哪些域名
                .allowedOriginPatterns("*")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许的HTTP方法
                .allowedHeaders("*") // 允许所有请求头
                .exposedHeaders("*");// 允许暴露所有响应头
    }
}
