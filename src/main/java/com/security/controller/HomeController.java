package com.security.controller;

import com.security.mail.SendEmail;
import com.security.model.User;
import com.security.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class HomeController {


    @Autowired
    public MyRepository myRepository;

    @Autowired
    SendEmail sendEmail;

    @GetMapping(value = "/signup")
    public String registrationform () {
        return "/register";
    }




    @PostMapping("/user/register")
    public ModelAndView gisterUser(@ModelAttribute("user") User user, HttpServletRequest request){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(user.getPassword()));

        user.setExpiryDate(new MyDate().calculateExpiryDate());

        user.setEnabled(false);

        String token = UUID.randomUUID().toString();
        user.setToken(token);

        myRepository.addSave(user);

        String appUrl = "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/regConfirm" + user;
        sendEmail.sendMail(appUrl);

        return new ModelAndView("redirect:/login");
    }


    @RequestMapping("/regConfirm")
    public String confirmRegistration(@RequestParam("token") String token) {

        User user = myRepository.getUserByToken(token);

        user.setEnabled(true);


        myRepository.update(user);

        return "/login";
    }
















    @GetMapping("/")
    public String home () {
        return "/home";
    }

    @GetMapping("/user")
    public String user () {
        return "/user";
    }

    @GetMapping("/users")
    public String muUser () {
        return "/user";
    }

    @GetMapping("/admin")
    public String admin () {
        return "/admin";
    }

    @GetMapping("/login")
    public String login () {
        return "/login";
    }

    @GetMapping("/supervisor")
    public String supervisor () {
        return "/supervisor";
    }
}
