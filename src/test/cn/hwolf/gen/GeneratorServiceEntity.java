package cn.hwolf.gen;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * @author hwolf
 * @email h.wolf@qq.com
 * @date 2018/2/8.
 */
public class GeneratorServiceEntity {
    @Test
    public void generateCode() {
        String packageName = "cn.hwolf";
        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
//        generateByTables(serviceNameStartWithI, packageName, "detailed_shoes", "simple_shoes");
        generateByTables(serviceNameStartWithI, packageName, "test_table");
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://localhost:3306/browse_mall";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("root")
                .setPassword("root")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setSuperMapperClass("cn.hwolf.common.mapper.SuperMapper")
                //下划线转驼峰
                .setNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                .setInclude(tableNames)
                //restController 风格
                .setRestControllerStyle(true)
                //加上个R注解
                .entityTableFieldAnnotationEnable(true);

        config.setActiveRecord(false)
                .setAuthor("hwolf")
                .setOutputDir("/Users/hwolf/IdeaProjects/browse-mall/src/main/java")
                // 关闭 XML 二级缓存
                .setEnableCache(false)
                .setFileOverride(true);
        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }
        new AutoGenerator()
                .setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}
