package com.security.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class SendEmail {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendMail(String message){

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("vasa@gmail.com");
        msg.setFrom("vasa@gmail.com");
        msg.setSubject("Пользователь арегистрирован");
        msg.setText(message);

        javaMailSender.send(msg);
    }
}
