package org.springboot.ostest.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		Topic TopicArray[] = { new Topic("1", "Physics", "Course for theoritical Physics"),
				new Topic("2", "Chemistry", "Inorganic chemistry for beginners"),
				new Topic("3", "Maths", "Vectors, Mechanics and Geometry")

		};
		return Arrays.asList(TopicArray);
	}

}
