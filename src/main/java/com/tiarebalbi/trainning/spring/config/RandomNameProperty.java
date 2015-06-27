package com.tiarebalbi.trainning.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@ConfigurationProperties(
        prefix = "trainning.service.randomname"
)
public class RandomNameProperty {

    private String api;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }
}
