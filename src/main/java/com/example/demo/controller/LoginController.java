package com.example.demo.controller;

import com.example.demo.service.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private Account acc;

    @RequestMapping("/logindetails")
    public  String display(){
        return  acc.getMail()+" --- "+acc.getUserName()+" ---- "+acc.getPassword()+"---"+acc.getAddress();
    }
}
