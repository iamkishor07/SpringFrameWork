package com.example.demo.service;

import com.example.demo.Repositry.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@Service
public class TopicServices {

    List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic(1,"JAVa","JAVA CrashCourse")));


    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(int id){
        Optional<Topic> found = Optional.empty();
        for (Topic t : topics) {
            if (t.getId()== id) {
                found = Optional.of(t);
                break;
            }
        }
        Topic topic = found.get();
        return topic;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(int id,Topic topic) {
        for(int i=0;i< topics.size();i++){
            Topic t= topics.get(i);
            if(t.getId()==id){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(int id) {
        topics.remove(topics.stream().filter(t->t.getId()==id).findFirst().get());
        return;
    }
}
