package com.example.demo.service;

import com.example.demo.Entity.Topic;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TopicServices {
    public  List<Topic> getTopics();
    public Topic getTopic(int id);
    public void addTopic(Topic topic);
    public void updateTopic(int id,Topic topic);
    public void deleteTopic(int id);
}
