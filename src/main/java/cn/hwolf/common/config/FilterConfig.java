package cn.hwolf.common.config;

import cn.hwolf.common.xss.XssFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.DelegatingFilterProxy;

import javax.servlet.DispatcherType;

/**
 * Filter配置
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
@Configurable
public class FilterConfig {
    /**
     *
     * @return
     */
    @Bean
    public FilterRegistrationBean shiroFilterRegistration() {
        // 获取已有的Filter Beans
        FilterRegistrationBean registration = new FilterRegistrationBean();
        // 将自定义shiro过滤器加入Filter
        registration.setFilter(new DelegatingFilterProxy("shiroFilter"));
        // 该值缺省为false，表示生命周期由SpringApplicationContext管理
        // 设置为true则表示由ServletContainer管理
        registration.addInitParameter("targetFilterLifecycle", "true");
        registration.setEnabled(true);
        registration.setOrder(Integer.MAX_VALUE - 1);
        //
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Bean
    public FilterRegistrationBean xssFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        // Xss过滤
        registration.setFilter(new XssFilter());
        registration.addUrlPatterns("/*");
        registration.setName("xssFilter");
        registration.setOrder(Integer.MAX_VALUE);
        return registration;
    }
}
