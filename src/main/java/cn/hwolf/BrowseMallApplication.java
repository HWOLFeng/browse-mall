package cn.hwolf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/7.
 */

@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement
public class BrowseMallApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(BrowseMallApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BrowseMallApplication.class);
    }
}
