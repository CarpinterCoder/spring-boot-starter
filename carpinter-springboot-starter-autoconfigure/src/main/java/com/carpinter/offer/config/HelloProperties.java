package com.carpinter.offer.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author XiaoNing
 * @date 2020/5/26
 */
@ConfigurationProperties(prefix = "carpinter.hello")
public class HelloProperties {
    /** 前缀 */
    private String prefix;

    /** 后缀 */
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
