package dev.arzak21st.courseapi.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

    @Autowired
    TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopic(int topicId) {
        return topicRepository.findByTopicId(topicId);
    }

    public Topic saveTopic(Topic topic) {
        return topicRepository.save(topic);
    }

    public boolean deleteTopic(int topicId) {

        Topic savedTopic = topicRepository.findByTopicId(topicId);
        if(savedTopic != null) {

            topicRepository.deleteById(topicId);
            return true;
        }
        return false;
    }
}
