package dev.arzak21st.courseapi.course;

import dev.arzak21st.courseapi.topic.Topic;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int courseId;

    @Column(unique = true)
    private String name;

    @ManyToOne
    @JsonIgnore // Tells Jackson (The library used by Spring Boot for JSON serialization and deserialization) NOT to include these fields in the JSON output. Otherwise it will keep serializing infinitey since we have a bidirectional relationship
    Topic topic;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "Course{" + "courseId=" + courseId + ", name=" + name + '}';
    }
}
