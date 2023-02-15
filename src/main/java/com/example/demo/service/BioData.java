package com.example.demo.service;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
@ComponentScan
public interface BioData {

    String getName();
}
