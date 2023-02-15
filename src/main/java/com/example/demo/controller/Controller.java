package com.example.demo.controller;

import com.example.demo.service.Account;
import com.example.demo.service.BioData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private BioData bioData;
//    @Autowired
//    Account acc;

//    @RequestMapping("/logindetails")
//    public  String display(){
//        return  acc.getMail()+""+acc.getUserName()+""+acc.getPassword();
//    }
    @RequestMapping("/name")
    public String getName()
    {
       return bioData.getName();
    }

}
