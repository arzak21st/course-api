package dev.arzak21st.courseapi.temp;

import dev.arzak21st.courseapi.topic.Topic;
import dev.arzak21st.courseapi.topic.TopicRepository;
import dev.arzak21st.courseapi.course.Course;
import dev.arzak21st.courseapi.course.CourseRepository;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Temp {

    @Autowired
    TopicRepository topicRepository;

    @Autowired
    CourseRepository courseRepository;

    @PostConstruct
    public void saveDefaultTopic() {

        Topic topic1 = new Topic();
        topic1.setName("Programming");

        Topic savedTopic = topicRepository.save(topic1);

        Course course1 = new Course();
        course1.setName("Java Programming");
        course1.setTopic(savedTopic);

        Course course2 = new Course();
        course2.setName("C++ Programming");
        course2.setTopic(savedTopic);

        courseRepository.save(course1);
        courseRepository.save(course2);
    }
}
