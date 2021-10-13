package com.inonity.justpay;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by @ruhul on 10/10/21
 */

@Data
@ConfigurationProperties(prefix = "justpay")
public class JustPayConfigurationProperties {

    private long transferThreshold = Long.MAX_VALUE;
}
