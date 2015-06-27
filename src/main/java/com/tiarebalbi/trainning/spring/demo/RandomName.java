package com.tiarebalbi.trainning.spring.demo;

import org.springframework.web.client.RestTemplate;

/**
 * Funcionalidade basica para demonstração da inicialização deste componente
 *
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
public class RandomName {

    private final String api;

    public RandomName(String api) {
        this.api = api;
    }

    public String getRandomName() {
        RestTemplate restTemplate = new RestTemplate();
        NameModel nome = restTemplate.getForObject(this.api, NameModel.class);
        return nome.getFullName();
    }

}
