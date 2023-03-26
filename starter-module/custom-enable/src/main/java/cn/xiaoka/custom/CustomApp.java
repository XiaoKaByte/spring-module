package cn.xiaoka.custom;

import cn.xiaoka.custom.config.Custom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * <description>
 *
 * @author xiaoka
 * @since 1.0.0 2023/3/26
 */
@SpringBootApplication
public class CustomApp {

    @Autowired
    private Custom custom;
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CustomApp.class, args);

        Custom bean = context.getBean(Custom.class);
        System.out.println(bean);


    }
}
