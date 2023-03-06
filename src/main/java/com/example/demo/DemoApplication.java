package com.example.demo;

import com.example.demo.Entity.Topic;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com/example/demo")
public class DemoApplication {

	public static void main(String[] args) throws JsonProcessingException {
//		SpringApplication.run(DemoApplication.class, args);
		Topic t=new Topic(1,"NLP","Naturallearning program");
		ObjectMapper obj=new ObjectMapper();
		String u=obj.writeValueAsString(t);
		System.out.println(u);
		String json="{\"id\":1,\"courseName\":\"NLP\",\"courseDescription\":\"Naturallearning program\"}";
		Topic topic = new Topic();
		Topic data=obj.readValue(json, Topic.class);
		System.out.println(data.getId()+" "+data.getCourseName()+" "+data.getCourseDescription());
	}

}

