package org.themohit.spring_security_demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.themohit.spring_security_demo.model.User;
import org.themohit.spring_security_demo.model.UserPricipal;
import org.themohit.spring_security_demo.repository.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=repo.findByUsername(username);

        if(user==null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("User not found with given username");
        }
        return new UserPricipal(user);
    }
}
