package cn.hwolf.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 简易日期、时间处理
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class DateUtils {
    /**
     * 时间格式(yyyy-MM-dd)
     */
    public final static String DATE_PATTERN = "yyyy-MM-dd";
    /**
     * 时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public final static String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    /**
     * 不带分隔符
     */
    public final static String DATE_TIME_PATTERN_FULL = "yyyyMMddHHmmss";

    /**
     * 默认时间格式为 yyyy-MM-dd
     * @param date
     * @return
     */
    public static String format(Date date) {
        return format(date, DATE_PATTERN);
    }

    public static String format(Date date, String pattern) {
        if(date != null){
            SimpleDateFormat df = new SimpleDateFormat(pattern);
            return df.format(date);
        }
        return null;
    }

}
