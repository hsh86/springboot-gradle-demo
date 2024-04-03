//package com.example.springdemo.properties;
//
//import lombok.Data;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.stereotype.Component;
//
//
//@Data
//@PropertySource("classpath:application.yml")
//@ConfigurationProperties(prefix = "memcached")
//@Component
//public class XMemcachedProperties {
//
//    /**
//     * memcached服务器节点
//     */
//    private String servers;
//
//    /**
//     * 设置默认操作超时
//     */
//    private Long opTimeout;
//
//    /**
//     * nio连接池的数量
//     */
//    private Integer poolSize;
//
//    /**
//     * 是否开启失败模式
//     */
//
//    private Boolean failureMode;
//
//    /**
//     * 是否使用memcached缓存
//     */
//    private Boolean enabled;
//
//}