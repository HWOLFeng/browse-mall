package cn.hwolf.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyLog {
    String value() default "";
}
