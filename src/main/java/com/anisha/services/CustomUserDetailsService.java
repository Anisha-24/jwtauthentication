package com.anisha.services;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        if(username.equals("Anisha")) //fixed service: call the user entity when connected with database
        {
            return new User("Anisha","Test123", new ArrayList<>());
        }
        else
        {
            throw new UsernameNotFoundException("!! User not found !!");
        }

    }
}
