package cn.hwolf.manager.thirdparty.sms;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public interface SmsClient {
    /**
     * 发送短信
     * @param mobile
     * @param templateCode
     * @param ParamString
     * @return
     */
    boolean sendSMSToUser(String mobile, String templateCode, String ParamString);
}
