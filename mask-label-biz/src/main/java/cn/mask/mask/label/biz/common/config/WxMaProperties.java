package cn.mask.mask.label.biz.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "wx")
public class WxMaProperties {
    private String appId;
    private String appSecret;
    private String wxRedirectUri;
}
