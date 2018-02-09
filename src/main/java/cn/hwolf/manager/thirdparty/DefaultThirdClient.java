package cn.hwolf.manager.thirdparty;

import cn.hwolf.manager.thirdparty.qiniu.QiniuClient;
import cn.hwolf.manager.thirdparty.qiniu.QiniuClientFactory;
import cn.hwolf.manager.thirdparty.sms.SmsClient;
import cn.hwolf.manager.thirdparty.sms.SmsClientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 第三方统一接口
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class DefaultThirdClient implements ThirdClient {
    private static final SmsClient SMS_CLIENT = SmsClientFactory.getSMSClient();
    private static final QiniuClient QINIU_CLIENT = QiniuClientFactory.getQiniuClient();

    private static final Logger logger = LoggerFactory.getLogger(DefaultThirdClient.class);

    @Override
    public boolean sendVerifyCode(String mobile, String verifyCode) {
        String paramStr = "{\"code\":\"" + verifyCode + "\"}";
        //TODO
        return SMS_CLIENT.sendSMSToUser(mobile, "", paramStr);
    }

    @Override
    public String getUpToken() {
        return QINIU_CLIENT.getUpToken();
    }

    @Override
    public String getImgUrl(String imgName) {
        return QINIU_CLIENT.getImgUrl(imgName);
    }

}
