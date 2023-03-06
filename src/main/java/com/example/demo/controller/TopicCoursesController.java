package com.example.demo.controller;

import com.example.demo.Entity.Topic;
import com.example.demo.service.TopicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicCoursesController {

    @Autowired
    TopicServices topicservice;

    @RequestMapping("/Topics") public List<Topic> getAllTopics(){
        return topicservice.getTopics();
        //This is the get request that mapped to /Topics
        //This method returns all the topics that are present in the list of topics
        //As this returns Java objects (Topics) yet it get converts to JSON format by SPring MVC
        //This happens internally that is provided by Spring MVC framework
    }

    @RequestMapping("/Topics/{id}") public Topic getTopic(@PathVariable int id){
        return topicservice.getTopic(id);
        //This is the get request that mapped to /Topics/{id}
        //This method returns the Topic object which is matched to the given id
        //As this returns Java object yet it get converts to JSON format by SPring MVC
        //This happens internally that is provided by Spring MVC framework
    }

    @RequestMapping(method = RequestMethod.POST,value = "/Topics") public void addTopic(@RequestBody Topic topic){
         topicservice.addTopic(topic);
         //This is the post method which is mapped to /Topics
        //This get create/add new post data to the resource
    }


    @RequestMapping(method = RequestMethod.PUT,value = "/Topics/{id}") public void updateTopic(@PathVariable int id,@RequestBody Topic topic){
        topicservice.updateTopic(id,topic);
        //This is the put method which mapped to /topics/id
        //This get updates the resource for the specified id in the list
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/Topics/{id}") public void deleteTopic(@PathVariable int id){
        topicservice.deleteTopic(id);
        //This is the Delete method which mapped to /topics/id
        //This get method deletes the topic object in  the resource for the specified id in the list
    }


}
