package dev.arzak21st.courseapi.topic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicRestController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{topicId}")
    public Topic getTopic(@PathVariable int topicId) {
        return topicService.getTopic(topicId);
    }

    @PostMapping("/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.saveTopic(topic);
    }

    @PutMapping("/topics")
    public void updateTopic(@RequestBody Topic topic) {
        topicService.saveTopic(topic);
    }

    @DeleteMapping("/topics/{topicId}")
    public void deleteTopic(@PathVariable int topicId) {
        topicService.deleteTopic(topicId);
    }
}
