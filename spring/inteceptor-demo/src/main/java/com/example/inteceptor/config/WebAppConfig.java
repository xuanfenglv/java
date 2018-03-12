package com.example.inteceptor.config;

import com.example.inteceptor.inteceptor.SessionInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author:Lvxingqing
 * @Description:
 * @Date:Create in 17:35 2018/3/12
 * @Modified By:
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {

    /**
     * 注册 拦截器
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 设置拦截的路径、不拦截的路径、优先级等等
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/*").excludePathPatterns("/login");
    }
}
