package org.springboot.ostest.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>();
			
	{
		
		topics.addAll(Arrays.asList( new Topic("1", "Physics", "Course for theoritical Physics"),
				new Topic("2", "Chemistry", "Inorganic chemistry for beginners"),
				new Topic("3", "Maths", "Vectors, Mechanics and Geometry"),new Topic("4", "English", "Literature")));
	}	
			

	public List<Topic> getTopics() {
		return topics;
	}
	public Topic getTopic(String id){
		Iterator<Topic> tItr = topics.iterator();
		Topic rtTopic = null;
		while(tItr.hasNext()){
			Topic topic = tItr.next();
			if(id.equals(topic.getId())){
				rtTopic = topic;
			}
		}
		return rtTopic;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}
	public void addTopic(Topic topic) {
		Topic newTopic = new Topic();
		String rndmId = Integer.toString((int) (Math.random() * 10));
		System.out.println("Random id used" + rndmId);
		newTopic.setId(rndmId);
		newTopic.setDescription(topic.getDescription());
		newTopic.setName(topic.getName());
		topics.add(newTopic);
	}
}
