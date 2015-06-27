package com.tiarebalbi.trainning.spring.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Modelo basico conforme modelo do API
 * http://api.uinames.com
 *
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
public class NameModel {

    private String name;
    private String surname;
    private String gender;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public String getFullName() {
        return this.name + " " + this.surname;
    }
}
