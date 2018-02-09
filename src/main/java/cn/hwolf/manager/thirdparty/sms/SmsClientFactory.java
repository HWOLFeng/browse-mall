package cn.hwolf.manager.thirdparty.sms;

import cn.hwolf.manager.thirdparty.sms.impl.DefaultSmsClient;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class SmsClientFactory {
    private static final SmsClient SMSClient;

    static {
        SMSClient = new DefaultSmsClient();
    }

    public SmsClientFactory() {
    }

    public static SmsClient getSMSClient(){
        return SMSClient;
    }
}
