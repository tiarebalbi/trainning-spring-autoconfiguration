package com.tiarebalbi.trainning.spring.config;

import com.tiarebalbi.trainning.spring.demo.RandomName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

/**
 * Configuração do Serviço de {@link com.tiarebalbi.trainning.spring.demo.RandomName}
 *
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@Configuration
@ConditionalOnClass(RestTemplate.class)
@ConditionalOnProperty(prefix = "trainning.service.randomname", value = "api")
@EnableConfigurationProperties(RandomNameProperty.class)
public class ApplicationNameConfig {

    private static Logger LOGGER = Logger.getLogger("c.t.t.s.c.ApplicationNameConfig");

    @Autowired
    private RandomNameProperty randomNameProperty;

    @PostConstruct
    public void applicationName() {
        RandomName randomName = new RandomName(randomNameProperty.getApi());
        LOGGER.info("Inicializando " + randomName.getRandomName());
    }
}