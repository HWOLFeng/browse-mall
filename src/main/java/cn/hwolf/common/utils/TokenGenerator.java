package cn.hwolf.common.utils;

import cn.hwolf.common.exception.RRException;

import java.security.MessageDigest;
import java.util.UUID;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class TokenGenerator {
    /**
     * @return 随机UUID
     */
    public static String generateValue() {
        return generateValue(UUID.randomUUID().toString());
    }

    private static final char[] hexCode = "0123456789abcdef".toCharArray();

    /**
     * 生成算法
     * @param data
     * @return
     */
    public static String toHexString(byte[] data) {
        if(data == null) {
            return null;
        }
        StringBuilder r = new StringBuilder(data.length*2);
        for ( byte b : data) {
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static String generateValue(String param) {
        try {
            // MD5
            MessageDigest algorithm = MessageDigest.getInstance("MD5");
            algorithm.reset();
            algorithm.update(param.getBytes());
            byte[] messageDigest = algorithm.digest();
            return toHexString(messageDigest);
        } catch (Exception e) {
            throw new RRException("生成Token失败", e);
        }
    }
}
