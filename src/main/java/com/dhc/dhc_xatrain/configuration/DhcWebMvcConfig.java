package com.dhc.dhc_xatrain.configuration;

import com.dhc.dhc_xatrain.intercept.SessionIntercept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DhcWebMvcConfig implements WebMvcConfigurer {
    @Autowired
    private SessionIntercept sessionIntercept;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/login");
//        registry.addViewController("/**").setViewName("/login");
        registry.addViewController("/ws").setViewName("/ws");
//        super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(sessionIntercept);
        addInterceptor.addPathPatterns("/**");
        addInterceptor.excludePathPatterns("/**.html", "/**/**.**", "/", "/login/*", "/ws", "/welcome", "/endpointWisely", "/topic/*");
    }
}
