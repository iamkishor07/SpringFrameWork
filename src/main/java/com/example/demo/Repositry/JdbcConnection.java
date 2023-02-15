package com.example.demo.Repositry;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@PropertySource("add.properties")
@Component
public class JdbcConnection {

    @Value("${name}") public String userName;
    @Value("${mail}") private  String mail;
    @Value("${psswd}") private  String password;

    @Value("${address}") private String Address;

}
