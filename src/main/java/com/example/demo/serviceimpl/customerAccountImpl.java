package com.example.demo.serviceimpl;

import com.example.demo.Repositry.AccountDao;
import com.example.demo.service.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class customerAccountImpl implements Account {

    @Autowired
    private AccountDao obj;
    @Override
    public String getUserName() {
        return obj.getUser();
    }

    @Override
    public String getMail() {
        return obj.getmail();
    }

    @Override
    public String getPassword() {
        return obj.getPasswd();
    }

    @Override
    public String getAddress() {
        return obj.getAddress();
    }
}
