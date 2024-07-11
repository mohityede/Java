package org.themohit.spring_security_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.themohit.spring_security_demo.model.User;
import org.themohit.spring_security_demo.repository.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JwtService jwtService;

    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    public User registerUser(User user){
        user.setPassword(encoder.encode(user.getPassword()));
        System.out.println(user.getPassword());
        repo.save(user);
        return user;
    }

    public String loginUser(User user) {
        Authentication auth= authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(),
                        user.getPassword()
                )
        );
        if(auth.isAuthenticated()) {
            System.out.println("login success");
            return jwtService.generateJwtToken(user.getUsername());
        }
        return "login failed";
    }
}
