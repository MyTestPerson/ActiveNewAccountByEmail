package com.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.*;
import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MyTest {


    public static void main(String[] args) {
        String token = UUID.randomUUID().toString();
        System.out.println(token);
    }











//    public static PasswordEncoder createDelegatingPasswordEncoder() {
//        String encodingId = "bcrypt";
//        Map<String, PasswordEncoder> encoders = new HashMap();
//        encoders.put(encodingId, new BCryptPasswordEncoder());
//        encoders.put("ldap", new LdapShaPasswordEncoder());
//        encoders.put("MD4", new Md4PasswordEncoder());
//        encoders.put("MD5", new MessageDigestPasswordEncoder("MD5"));
//        encoders.put("noop", NoOpPasswordEncoder.getInstance());
//        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
//        encoders.put("scrypt", new SCryptPasswordEncoder());
//        encoders.put("SHA-1", new MessageDigestPasswordEncoder("SHA-1"));
//        encoders.put("SHA-256", new MessageDigestPasswordEncoder("SHA-256"));
//        encoders.put("sha256", new StandardPasswordEncoder());
//        return new DelegatingPasswordEncoder(encodingId, encoders);
//    }

//    public static void main(String[] args) {

//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        String s = encoder.encode("1234");
//
//        System.out.println(s);


//        String idForEncode = "bcrypt";
//
//        Map<String, PasswordEncoder> encoders = new HashMap<>();
//
//        encoders.put(idForEncode, new BCryptPasswordEncoder());
//        encoders.put("noop", NoOpPasswordEncoder.getInstance());
//        encoders.put("pbkdf2", new Pbkdf2PasswordEncoder());
//        encoders.put("scrypt", new SCryptPasswordEncoder());
//        encoders.put("sha256", new StandardPasswordEncoder());
//
//        PasswordEncoder passwordEncoder = new DelegatingPasswordEncoder(idForEncode, encoders);
//
//        System.out.println(passwordEncoder.encode("1234"));
//        System.out.println();
//
//
//    }
}
