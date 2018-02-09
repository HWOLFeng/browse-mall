package cn.hwolf.common.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

/**
 * 生成验证码
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */
@Configurable
public class KaptchaConfig {
    @Bean
    public DefaultKaptcha producer() {
        Properties properties = new Properties();
        // 加粗
        properties.put("kaptcha.border", "no");
        // 颜色
        properties.put("kaptcha.textproducer.font.color", "black");
        // 字体大小
        properties.put("kaptcha.textproducer.char.space", "5");
        Config config = new Config(properties);
        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}
