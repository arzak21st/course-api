package dev.arzak21st.courseapi.topic;

import dev.arzak21st.courseapi.course.Course;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int topicId;

    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "topic", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    List<Course> courses;

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Topic{" + "topicId=" + topicId + ", name=" + name + ", courses=" + courses + '}';
    }
}
