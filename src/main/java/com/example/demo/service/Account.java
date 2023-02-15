package com.example.demo.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;


public interface Account {

   String getUserName();
   String getMail();
   String getPassword();

   String getAddress();
}
