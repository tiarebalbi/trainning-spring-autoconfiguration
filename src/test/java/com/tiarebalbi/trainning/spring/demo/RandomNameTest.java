package com.tiarebalbi.trainning.spring.demo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
public class RandomNameTest {

    @Test
    public void testGetRandomName() throws Exception {
        String nomeCompleto = new RandomName("http://api.uinames.com").getRandomName();
        assertNotNull(nomeCompleto);
    }
}