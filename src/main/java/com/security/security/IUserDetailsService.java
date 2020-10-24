package com.security.security;


import com.security.model.User;
import com.security.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class IUserDetailsService implements UserDetailsService {

    private static final String ROLE_USER = "ROLE_USER";

    @Autowired
    public MyRepository myRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


        User user = myRepository.getByUsername(username);


        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                user.getEnabled(), true, true, true, getAuthorities());
    }


    private Collection<? extends GrantedAuthority> getAuthorities(){
        return Collections.singletonList(new SimpleGrantedAuthority(IUserDetailsService.ROLE_USER));
    }


}