package cn.xiaoka.custom.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <description>
 *
 * @author xiaoka
 * @since 1.0.0 2023/3/26
 */
@Data
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {
    private String host="localhost";
    private Integer port=6379;
}
