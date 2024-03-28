package dev.arzak21st.courseapi.course;

import dev.arzak21st.courseapi.topic.Topic;
import dev.arzak21st.courseapi.topic.TopicRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    TopicRepository topicRepository;

    public List<Course> getAllCourses(int topicId) {
        return courseRepository.findByTopic_TopicId(topicId);
    }

    public Course getCourse(int courseId) {
        return courseRepository.findByCourseId(courseId);
    }

    public Course saveCourse(int topicId, Course course) {

        Topic savedTopic = topicRepository.findByTopicId(topicId);
        if(savedTopic != null) {

            course.setTopic(savedTopic);
            return courseRepository.save(course);
        }
        return null;
    }

    public boolean deleteCourse(int courseId) {

        Course savedCourse = courseRepository.findByCourseId(courseId);
        if(savedCourse != null) {

            courseRepository.deleteById(courseId);
            return true;
        }
        return false;
    }
}
