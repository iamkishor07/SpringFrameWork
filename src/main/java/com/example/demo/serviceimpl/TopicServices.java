package com.example.demo.serviceimpl;

import com.example.demo.Entity.Topic;
import com.example.demo.Dao.TopicCoursesRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Component
public class TopicServices {


 @Autowired
 TopicCoursesRepositry obj;

//    List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic(1,"JAVa","JAVA CrashCourse")));


    public List<Topic> getTopics() {
        List<Topic> ans=(List<Topic>)obj.findAll();
         return ans;
    }


    public Optional<Topic> getTopic(int id){
//        Optional<Topic> found = Optional.empty();
//        for (Topic t : topics) {
//            if (t.getId()== id) {
//                found = Optional.of(t);
//                break;
//            }
//        }
//        Topic topic = found.get();
        Optional<Topic> topic= obj.findById(id);
        return topic;
    }

    public void addTopic(Topic topic) {
//        topics.add(topic);
        obj.save(topic);
    }

    public void updateTopic(int id,Topic topic) {
//        for(int i=0;i< topics.size();i++){
//            Topic t= topics.get(i);
//            if(t.getId()==id){
//                topics.set(i,topic);
//                return;
//            }
//        }
        topic.setId(id);
        obj.save(topic);
    }

    public void deleteTopic(int id) {
//        topics.remove(topics.stream().filter(t->t.getId()==id).findFirst().get());
        obj.deleteById(id);
    }
}
