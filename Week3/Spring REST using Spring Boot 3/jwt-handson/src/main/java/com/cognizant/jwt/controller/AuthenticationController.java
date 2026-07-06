package com.cognizant.jwt.controller;

import com.cognizant.jwt.model.AuthenticationResponse;
import com.cognizant.jwt.security.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String username = getUser(authHeader);

        String token = JwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }

    private String getUser(String authHeader) {

        String encodedCredentials = authHeader.substring("Basic ".length());

        byte[] decodedBytes =
                Base64.getDecoder().decode(encodedCredentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        return credentials.split(":")[0];
    }
}