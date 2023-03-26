package cn.xiaoka.custom.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <description>
 *
 * @author xiaoka
 * @since 1.0.0 2023/3/26
 */
@Configuration
@EnableConfigurationProperties(RedisProperties.class)
@ConditionalOnClass(RedisProperties.class)
public class RedisAutoConfigure {

    @Bean
    @ConditionalOnMissingBean(name = "jedis")
    public Custom custom(RedisProperties properties){
        return new Custom(properties.getHost(),properties.getPort());
    }
}
