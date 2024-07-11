package org.themohit.spring_security_demo.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.config.annotation.rsocket.RSocketSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {
    private static final String SECRET= "6jVMnsSofioc66loAlcFlHlCyjjCVZILMnsSofioc6MnsSofioc6MnsSofioc6MnsSofioc6";

//    private static String secretKye;
//
//    public JwtService(){
//        try {
//            secretKye=secretKeyGenerator();
//        } catch (NoSuchAlgorithmException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    private String secretKeyGenerator() throws NoSuchAlgorithmException {
//        KeyGenerator keyGen= KeyGenerator.getInstance("HmacSHA256");
//        SecretKey key=keyGen.generateKey();
//        System.out.println("Genereted Secret key: "+key.toString());
//        return Base64.getEncoder().encodeToString(key.getEncoded());
//    }

    private Key getKey(){
        byte[] keyBytes= Decoders.BASE64.decode(SECRET);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    public String generateJwtToken(String username){
        Map<String,Object> claims=new HashMap<>();

        String token= Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+(1000*60*30)))
                .signWith(getKey(), SignatureAlgorithm.HS384)
                .compact();
        return token;
    }

    public String extractUsername(String token){
        return extractClaim(token, Claims::getSubject);
    }

    private <T>T extractClaim(String token, Function<Claims,T> claimResolver) {
        final Claims claims=extractAllClaims(token);
        return claimResolver.apply(claims);
    }

    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .setSigningKey(getKey())
                .build()
                .parseSignedClaims(token)
                .getBody();
    }

    public boolean validateToken(String token, UserDetails userDetails) {
        final String username=extractUsername(token);
        return (username.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token){
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token){
        return extractClaim(token,Claims::getExpiration);
    }
}
