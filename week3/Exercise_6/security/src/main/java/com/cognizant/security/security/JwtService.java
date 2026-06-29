package com.cognizant.security.security;

import io.jsonwebtoken.Jwts;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;

@Service
public class JwtService {

    private final SecretKey secretKey = Jwts.SIG.HS256.key().build();
    public String generateToken(String username) {

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date()).expiration(new Date(System.currentTimeMillis()+1000*60*30))
                .signWith(secretKey).compact();
    }
}
