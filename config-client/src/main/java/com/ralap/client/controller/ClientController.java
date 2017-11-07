package com.ralap.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ralap on 2017/11/6.
 */
@RestController
public class ClientController {

    @Value("${profile}")
    private String profile;

    @GetMapping("/geProfile")
    public String getProfile() {
        return profile;

    }
}
