package cn.hwolf.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5 工具
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class MD5Utils {
    /**
     * 使用md5的算法进行加密
     * @param str
     * @return
     */
    public static String getMD5(String str) {
        try{
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // 16进制数字
            String md5code =  new BigInteger(1, md.digest()).toString(16);
            // 如果生成数字未满32位，需要前面补0
            for (int i = 0; i < 32 - md5code.length(); i++) {
                md5code = "0" + md5code;
            }
            return md5code;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有找到 md5 加密算法！");
        }

    }
}