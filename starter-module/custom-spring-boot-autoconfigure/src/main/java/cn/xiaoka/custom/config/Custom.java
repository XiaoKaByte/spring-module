package cn.xiaoka.custom.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <description>
 *
 * @author xiaoka
 * @since 1.0.0 2023/3/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Custom {
    private String host;
    private Integer port;
}
