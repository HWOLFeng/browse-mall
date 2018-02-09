package cn.hwolf.common.config;

import cn.hwolf.common.interceptor.CommonInterceptor;
import cn.hwolf.common.interceptor.LoggingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

/**
 * MVC拦截器配置
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter {
//    @Autowired
//    private AuthorizationInterceptor authorizationInterceptor;
    @Autowired
    private LoggingInterceptor loggingInterceptor;

//    @Autowired
//    private LoginUserHandlerMethodArgumentResolver loginUserHandlerMethodArgumentResolver;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 日志拦截所有
        registry.addInterceptor(loggingInterceptor).addPathPatterns("/**");
//        registry.addInterceptor(authorizationInterceptor).addPathPatterns("/api/**");
        registry.addInterceptor(new CommonInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
//        argumentResolvers.add(loginUserHandlerMethodArgumentResolver);
    }
}
