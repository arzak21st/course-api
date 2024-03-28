package dev.arzak21st.courseapi.course;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    Course findByCourseId(int courseId);

    public List<Course> findByTopic_TopicId(int topicId);
}
