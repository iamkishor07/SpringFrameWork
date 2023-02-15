package com.example.demo.Repositry;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@AllArgsConstructor
public class AccountDao {
    @Autowired
    private  JdbcConnection obj;

    public   String  getUser(){
       return obj.getUserName();
    }
    public   String  getmail(){
        return obj.getMail();
    }
    public   String  getPasswd(){
        return obj.getPassword();
    }
    public String getAddress(){
        return obj.getAddress();
    }
}
