package com.cxy.monitor.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 孤
 * @version v1.0
 * @Developers 张耀烽
 * @serviceProvider 四叶草安全(SeClover)
 * @description 获取Application配置数据
 * @date
 */
@Component
public class ApplicationValues {

    @Value("${http_pool.max_total}")
    private int maxTotal;

    @Value("${http_pool.default_max_per_route}")
    private int maxPerRoute;

    @Value("${http_pool.connect_timeout}")
    private int connTimeOut;

    @Value("${http_pool.connection_request_timeout}")
    private int connReqTimeOut;

    @Value("${http_pool.socket_timeout}")
    private int socketTimeout;

    @Value("${http_pool.validate_after_inactivity}")
    private int inactivity;

    public int getMaxTotal() {
        return maxTotal;
    }

    public int getMaxPerRoute() {
        return maxPerRoute;
    }

    public int getConnTimeOut() {
        return connTimeOut;
    }

    public int getConnReqTimeOut() {
        return connReqTimeOut;
    }

    public int getSocketTimeout() {
        return socketTimeout;
    }

    public int getInactivity() {
        return inactivity;
    }
}