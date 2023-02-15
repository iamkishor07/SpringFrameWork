package com.example.demo.serviceimpl;

import com.example.demo.service.BioData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:add.properties")
public class BioDataImpl implements BioData {

@Value("${name}") private  String name;
@Value("${Address}") private String address;

    @Override
    public String getName()
    {
        return name+"  "+address;
    }
}
