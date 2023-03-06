package com.example.demo.Dao;

import com.example.demo.Entity.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Component
public interface TopicCoursesRepositry extends CrudRepository<Topic,Integer> {
//    public  List<Topic> getTopics();
    public Topic getTopic(int id);
//    public void addTopic(Topic topic);
//    public void updateTopic(int id,Topic topic);
//    public void deleteTopic(int id);
}
