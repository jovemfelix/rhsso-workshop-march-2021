package com.dinuth.keycloakspringbootmicroservice;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class KeycloakSpringbootMicroserviceApplication implements ApplicationRunner {

    public static void main(String[] args) {
//        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
        SpringApplication.run(KeycloakSpringbootMicroserviceApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("Accept", "application/json");
//        String URL = "https://sso-cetelem.apps.cluster-7532.7532.sandbox1282.opentlc.com/auth/";
//
//        System.out.println("\n\nURL >> " + URL);
//
//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<String> response = restTemplate.exchange(URL,
//                HttpMethod.GET,
//                new HttpEntity(headers), String.class,
//                new HashMap<String, String>());
//
//        int statusCode = response.getStatusCodeValue();
//        System.out.println("\n\nXXXXX >> " + statusCode);
    }
}
