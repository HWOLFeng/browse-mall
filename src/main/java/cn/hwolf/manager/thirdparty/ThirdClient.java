package cn.hwolf.manager.thirdparty;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public interface ThirdClient {
    /**
     * 短信验证码
     * @param mobile 手机号
     * @param verifyCode 验证码
     * @return
     */
    boolean sendVerifyCode(String mobile, String verifyCode);
    /**
     * 获取七牛上传token
     * @return 上传token
     */
    String getUpToken();

    /**
     * 获取七牛图片域名
     * @param imgName 图片域名
     * @return 图片域名
     */
    String getImgUrl(String imgName);
}
