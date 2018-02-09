package cn.hwolf.common.exception;

import cn.hwolf.common.utils.Result;
import org.apache.shiro.authz.AuthorizationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 异常处理器
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
@RestControllerAdvice
public class RRExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(RRException.class)
    public Result handleRRException(RRException e){
        Result result = new Result();
        result.put("code", e.getCode());
        result.put("msg", e.getMessage());
        return result;
    }

    /**
     * dao层异常
     * @param e
     * @return
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Result handleDuplicateKeyException(DuplicateKeyException e){
        logger.error(e.getMessage(), e);
        return Result.error("数据库中已存在该记录");
    }

    /**
     * Shiro 异常
     * @param e
     * @return
     */
    @ExceptionHandler(AuthorizationException.class)
    public Result handleAuthorizationException(AuthorizationException e){
        logger.error(e.getMessage(), e);
        return Result.error("没有权限，请联系管理员授权");
    }

    /**
     * 拦截器异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e){
        logger.error(e.getMessage(), e);
        return Result.error();
    }
}
