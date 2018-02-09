package cn.hwolf.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Random;
import java.util.UUID;

/**
 * 验证码产生工具
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class VerificationCodeUtils {
    private static Random random;

    private static Logger logger = LoggerFactory.getLogger(VerificationCodeUtils.class);

    public static long createTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String createUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * @return 默认四位长度验证码
     */
    public static String createVerifyCode() {
        return VerificationCodeUtils.createVerifyCode(4);
    }

    public static String createVerifyCode(int size) {
        if (random == null){
            random = new Random();
        }
        StringBuilder vc = new StringBuilder();
        for (int i = 0; i < size; i++) {
            vc.append(random.nextInt(10));
        }
        return vc.toString();
    }

    public static boolean hasSame(Collection a, Collection b) {
        for (Object o : a) {
            if (b.contains(o)){
                return true;
            }
        }
        return false;
    }
}
