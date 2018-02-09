package cn.hwolf.common.interceptor;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义日志拦截器
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
@Component
public class LoggingInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("request.getRemoteAddr() : " + request.getRemoteAddr());
        logger.info("request.getRequestURI() : " + request.getRequestURI());
        logger.info("request.getMethod() : " + request.getMethod());
        logger.info("request.getParameterMap() : " + new Gson().toJson(request.getParameterMap().toString()));
        return true;
    }
}
