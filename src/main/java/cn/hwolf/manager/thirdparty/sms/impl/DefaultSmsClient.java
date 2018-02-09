package cn.hwolf.manager.thirdparty.sms.impl;

import cn.hwolf.manager.thirdparty.sms.SmsClient;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.dm.model.v20151123.SingleSendSmsRequest;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 短信发送配置
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
public class DefaultSmsClient implements SmsClient {
    private static Logger logger = LoggerFactory.getLogger(DefaultSmsClient.class);

    private static Properties prop;

    private static String accessKeyId;
    private static String accessKeySecret;
    private static String regionId;

    private static IAcsClient client;

    static {
        logger.info("============sms client 初始化===============");
        prop = new Properties();
        InputStream in = DefaultSmsClient.class.getClassLoader().getResourceAsStream("sdk/sms.properties");

        try {
            prop.load(in);
        } catch (IOException error) {
            logger.info(error.toString());
        }

        accessKeyId = prop.getProperty("accessKeyId");
        accessKeySecret = prop.getProperty("accessKeySecret");
        regionId = prop.getProperty("regionId");

        String product = prop.getProperty("product");
        String domain = prop.getProperty("domain");
        IClientProfile profile = DefaultProfile.getProfile(regionId, accessKeyId, accessKeySecret);
        try {
            // 初始化ascClient,暂时不支持多region
            DefaultProfile.addEndpoint(regionId,regionId,product,domain);
        } catch (ClientException e) {
            e.printStackTrace();
        }
        client = new DefaultAcsClient(profile);
    }


    public DefaultSmsClient() {

    }


    @Override
    public boolean sendSMSToUser(String mobile, String templateCode, String ParamString) {
        try{
            SingleSendSmsRequest request = new SingleSendSmsRequest();
            request.setSignName("hwolf");
            request.setTemplateCode(templateCode);
            // 发送号码
            request.setRecNum(mobile);
            // 短信内容
            request.setParamString(ParamString);
            client.getAcsResponse(request);
            logger.info("发送成功 " + mobile);
        }catch (Exception e){
            logger.error(e.toString());
            return false;
        }
        return true;
    }
}
